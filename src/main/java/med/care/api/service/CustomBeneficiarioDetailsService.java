package med.care.api.service;

import med.care.api.domain.Beneficiario;
import med.care.api.repository.BeneficiarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomBeneficiarioDetailsService implements UserDetailsService {

    private final BeneficiarioRepository beneficiarioRepository;

    public CustomBeneficiarioDetailsService(BeneficiarioRepository beneficiarioRepository) {
        this.beneficiarioRepository = beneficiarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Beneficiario beneficiario = beneficiarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Beneficiário não encontrado com o email: " + email));

        return org.springframework.security.core.userdetails.User
                .withUsername(beneficiario.getEmail())
                .password(beneficiario.getSenha())
                .roles("BENEFICIARIO")
                .build();
    }
}