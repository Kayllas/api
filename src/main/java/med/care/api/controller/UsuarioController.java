package med.care.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UsuarioController {

    @GetMapping("/dados")
    public String obterDadosUsuario() {
        return "Dados do administrador acessados com sucesso.";
    }

    @GetMapping("/relatorios")
    public String gerarRelatorios() {
        return "Relatórios gerados com sucesso.";
    }
}