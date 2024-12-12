package med.care.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import med.care.api.domain.Medico;
import med.care.api.service.dto.DadosListagemMedico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

}
