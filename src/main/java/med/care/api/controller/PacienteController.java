package med.care.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.care.api.domain.Paciente;
import med.care.api.service.dto.DadosCadastroPaciente;
import med.care.api.repository.PacienteRepository;


@RestController
@RequestMapping("pacientes")
public class PacienteController {

@Autowired
private PacienteRepository repository;

@PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));

    }

}
