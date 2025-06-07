package med.care.api.service;

import med.care.api.domain.Beneficiario;
import med.care.api.domain.Usuario;
import med.care.api.repository.BeneficiarioRepository;
import med.care.api.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UnifiedUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final BeneficiarioRepository beneficiarioRepository;

    public UnifiedUserDetailsService(UsuarioRepository usuarioRepository, BeneficiarioRepository beneficiarioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.beneficiarioRepository = beneficiarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(email)
                .map(u -> User.builder()
                        .username(u.getEmail())
                        .password(u.getSenha())
                        .roles("ADMIN")
                        .build())
                .orElseGet(() ->
                        beneficiarioRepository.findByEmail(email)
                                .map(b -> User.builder()
                                        .username(b.getEmail())
                                        .password(b.getSenha())
                                        .roles("BENEFICIARIO")
                                        .build())
                                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email))
                );
    }
}
