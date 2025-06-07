package med.care.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UsuarioController.class) // carrega apenas o controller
class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "ADMIN") // simula usuário com papel ADMIN
    void deveRetornarDadosDoUsuario() throws Exception {
        mockMvc.perform(get("/admin/dados"))
                .andExpect(status().isOk())
                .andExpect(content().string("Dados do administrador acessados com sucesso."));
    }

    @Test
    @WithMockUser(roles = "ADMIN")
    void deveGerarRelatorios() throws Exception {
        mockMvc.perform(get("/admin/relatorios"))
                .andExpect(status().isOk())
                .andExpect(content().string("Relatórios gerados com sucesso."));
    }
}
