package med.care.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {

    @GetMapping("/dados")
    public String obterDadosBeneficiario() {
        return "Dados do beneficiário acessados com sucesso.";
    }
}