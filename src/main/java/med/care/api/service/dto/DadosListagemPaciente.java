package med.care.api.service.dto;

import med.care.api.domain.Paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {

    public DadosListagemPaciente (Paciente paciente) {
        this(
        paciente.getId(),
        paciente.getNome(), 
        paciente.getEmail(),
        paciente.getCpf());
    }

}
