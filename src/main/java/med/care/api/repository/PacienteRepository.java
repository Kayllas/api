package med.care.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import med.care.api.domain.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
