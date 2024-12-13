package med.care.api.service.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String telefone, DadosEndereco endereco, Boolean ativo) {

}
