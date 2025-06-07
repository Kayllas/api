// package med.care.api.controller;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @WebMvcTest(ConsultaController.class)
// class ConsultaControllerTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @Test
//     void deveRetornarStatusOkAoChamarEndpointDeConsulta() throws Exception {
//         mockMvc.perform(MockMvcRequestBuilders.get("/consultas"))
//                 .andExpect(status().isOk());
//     }
// }