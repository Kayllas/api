package med.care.api.controller;

import med.care.api.domain.Beneficiario;
import med.care.api.repository.BeneficiarioRepository;
import med.care.api.repository.UsuarioRepository;
import med.care.api.service.dto.DadosLogin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthControllerTest {

    private BeneficiarioRepository beneficiarioRepository;
    private UsuarioRepository usuarioRepository;
    private BCryptPasswordEncoder passwordEncoder;
    private AuthController controller;

    @BeforeEach
    void setUp() {
        beneficiarioRepository = mock(BeneficiarioRepository.class);
        usuarioRepository = mock(UsuarioRepository.class);
        passwordEncoder = new BCryptPasswordEncoder();
        controller = new AuthController(beneficiarioRepository, usuarioRepository, passwordEncoder);
        controller.usuarioRepository = usuarioRepository;
        controller.passwordEncoder = passwordEncoder;
    }

    @Test
    void devePermitirLoginBeneficiarioComCredenciaisValidas() {
        String email = "email@teste.com";
        String senhaPura = "123456";
        String senhaHash = passwordEncoder.encode(senhaPura);

        var beneficiario = new Beneficiario(email, senhaHash, "Fulano");
        when(beneficiarioRepository.findByEmail(email)).thenReturn(Optional.of(beneficiario));

        var login = new DadosLogin(email, senhaPura);
        ResponseEntity<?> resposta = controller.loginBeneficiario(login);

        assertEquals(200, resposta.getStatusCodeValue());
        assertTrue(resposta.getBody().toString().contains("sucesso"));
    }

    @Test
    void deveFalharLoginBeneficiarioComCredenciaisInvalidas() {
        var login = new DadosLogin("inexistente@teste.com", "senhaerrada");
        when(beneficiarioRepository.findByEmail(login.email())).thenReturn(Optional.empty());

        ResponseEntity<?> resposta = controller.loginBeneficiario(login);

        assertEquals(401, resposta.getStatusCodeValue());
        assertTrue(resposta.getBody().toString().contains("Credenciais inválidas"));
    }
}
