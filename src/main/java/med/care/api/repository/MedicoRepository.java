package med.care.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import med.care.api.domain.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
