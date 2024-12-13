package med.care.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import med.care.api.domain.Paciente;
import med.care.api.service.dto.DadosListagemPaciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

}
