package med.care.api.service.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco, Boolean ativo) {

}
