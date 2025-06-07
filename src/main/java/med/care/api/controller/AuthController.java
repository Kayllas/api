package med.care.api.controller;

import med.care.api.domain.Beneficiario;
import med.care.api.domain.Usuario;
import med.care.api.repository.BeneficiarioRepository;
import med.care.api.repository.UsuarioRepository;
import med.care.api.service.dto.DadosLogin;
import med.care.api.service.dto.DadosCadastroBeneficiario;
import med.care.api.service.dto.DadosCadastroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired BeneficiarioRepository beneficiarioRepository;

    @Autowired UsuarioRepository usuarioRepository;

    @Autowired BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register/beneficiario")
    public ResponseEntity<?> cadastrarBeneficiario(@RequestBody @Valid DadosCadastroBeneficiario dados) {
        if (beneficiarioRepository.findByEmail(dados.email()).isPresent()) {
            return ResponseEntity.badRequest().body("E-mail já cadastrado para beneficiário.");
        }
        var beneficiario = new Beneficiario(dados.email(), passwordEncoder.encode(dados.senha()), dados.nomeCompleto());
        beneficiarioRepository.save(beneficiario);
        return ResponseEntity.ok("Cadastro de beneficiário realizado com sucesso.");
    }

    @PostMapping("/register/usuario")
    public ResponseEntity<?> cadastrarUsuario(@RequestBody @Valid DadosCadastroUsuario dados) {
        if (usuarioRepository.findByEmail(dados.email()).isPresent()) {
            return ResponseEntity.badRequest().body("E-mail já cadastrado para usuário.");
        }
        var usuario = new Usuario(dados.email(), passwordEncoder.encode(dados.senha()), dados.nomeCompleto());
        usuarioRepository.save(usuario);
        return ResponseEntity.ok("Cadastro de usuário realizado com sucesso.");
    }

    @PostMapping("/login/beneficiario")
    public ResponseEntity<?> loginBeneficiario(@RequestBody @Valid DadosLogin dados) {
        var beneficiario = beneficiarioRepository.findByEmail(dados.email());
        System.out.println("Beneficiário encontrado: " + beneficiario);

        if (beneficiario.isPresent() && passwordEncoder.matches(dados.senha(), beneficiario.get().getSenha())) {
            return ResponseEntity.ok("Login realizado com sucesso como beneficiário.");
        }

        return ResponseEntity.status(401).body("Credenciais inválidas para beneficiário.");
    }

    @PostMapping("/login/usuario")
    public ResponseEntity<?> loginUsuario(@RequestBody @Valid DadosLogin dados) {
        var usuario = usuarioRepository.findByEmail(dados.email());
        System.out.println("Usuario encontrado: " + usuario);

        if (usuario.isPresent() && passwordEncoder.matches(dados.senha(), usuario.get().getSenha())) {
            return ResponseEntity.ok("Login realizado com sucesso como usuário.");
        }

        return ResponseEntity.status(401).body("Credenciais inválidas para usuário.");
    }

    @GetMapping("/teste")
    public ResponseEntity<?> teste() {
        return ResponseEntity.ok("Endpoint funcionando corretamente.");
    }

    public AuthController(BeneficiarioRepository beneficiarioRepository, UsuarioRepository usuarioRepository, BCryptPasswordEncoder passwordEncoder) {
    this.beneficiarioRepository = beneficiarioRepository;
    this.usuarioRepository = usuarioRepository;
    this.passwordEncoder = passwordEncoder;
}

}