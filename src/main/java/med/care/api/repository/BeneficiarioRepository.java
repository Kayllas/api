package med.care.api.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import med.care.api.domain.Beneficiario;

import java.util.Optional;

@Lazy
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
    Optional<Beneficiario> findByEmail(String email);
}
