package med.care.api.service.dto;

import med.care.api.domain.Medico;
import med.care.api.domain.enumeration.Especialidade;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico (Medico medico) {
        this(medico.getNome(), 
        medico.getEmail(),
        medico.getCrm(),
        medico.getEspecialidade());
    }

}
