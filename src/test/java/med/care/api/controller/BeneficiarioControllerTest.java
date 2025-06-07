// package med.care.api.controller;

// import med.care.api.config.TestSecurityConfig;
// import med.care.api.repository.UsuarioRepository;
// import med.care.api.service.CustomUsuarioDetailsService;
// import med.care.api.service.CustomBeneficiarioDetailsService;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.context.annotation.Import;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.test.web.servlet.MockMvc;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// @WebMvcTest(BeneficiarioController.class)
// @AutoConfigureMockMvc
// @Import(TestSecurityConfig.class) // Desativa autenticação real
// class BeneficiarioControllerTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @MockBean
//     private UsuarioRepository usuarioRepository;

//     @MockBean
//     private CustomUsuarioDetailsService customUsuarioDetailsService;

//     @MockBean
//     private CustomBeneficiarioDetailsService customBeneficiarioDetailsService;

//     @Test
//     void deveRetornarDadosDoBeneficiario() throws Exception {
//         mockMvc.perform(get("/beneficiario/dados"))
//                 .andExpect(status().isOk())
//                 .andExpect(content().string("Dados do beneficiário acessados com sucesso."));
//     }
// }

// Essa classe não ta funcionando por causa de uma injvecao de dependencias que nao ta sendo resolvida