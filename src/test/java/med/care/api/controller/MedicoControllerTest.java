package med.care.api.controller;

import med.care.api.domain.Medico;
import med.care.api.domain.enumeration.Especialidade;
import med.care.api.repository.MedicoRepository;
import med.care.api.service.dto.DadosCadastroMedico;
import med.care.api.service.dto.DadosEndereco;
import med.care.api.service.dto.DadosListagemMedico;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MedicoControllerTest {

    @Mock
    private MedicoRepository repository;

    @InjectMocks
    private MedicoController controller;

    @Test
    void testListar() {
        Medico medico = mock(Medico.class);
        Page<Medico> page = new PageImpl<>(List.of(medico));

        when(repository.findAllByAtivoTrue(any(Pageable.class))).thenReturn(page);

        ResponseEntity<Page<DadosListagemMedico>> result = controller.listar(Pageable.unpaged());

        assertNotNull(result);
        assertNotNull(result.getBody());
        assertEquals(1, result.getBody().getTotalElements());
    }

    @Test
    void testCadastrar() {
        var endereco = new DadosEndereco("Rua A", "123", "Apto 1", "Bairro X", "Cidade Y", "SP", "00000-000");
        var dados = new DadosCadastroMedico("Dr. John", "john@example.com", "11999999999", "123456",
                Especialidade.CARDIOLOGIA, endereco);

        controller.cadastrar(dados);

        verify(repository, times(1)).save(any(Medico.class));
    }

}
