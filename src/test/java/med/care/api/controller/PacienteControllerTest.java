package med.care.api.controller;

import med.care.api.domain.Paciente;
import med.care.api.repository.PacienteRepository;
import med.care.api.service.dto.DadosCadastroPaciente;
import med.care.api.service.dto.DadosEndereco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PacienteControllerTest {

    @Mock
    private PacienteRepository repository;

    @InjectMocks
    private PacienteController controller;

    @Test
    void testCadastrar() {
        var endereco = new DadosEndereco("Rua B", "456", "Casa", "Bairro Z", "Cidade W", "RJ", "11111-111");
        var dados = new DadosCadastroPaciente("Maria", "maria@example.com", "21988888888", "12345678900", endereco);

        controller.cadastrar(dados);

        verify(repository, times(1)).save(any(Paciente.class));
    }

}
