package med.care.api.service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroUsuario(
    @NotBlank @Email String email,
    @NotBlank @Size(min = 6, max = 20) String senha,
    @NotBlank String nomeCompleto
) {}