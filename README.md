💻 Sobre o projeto

Med.care é uma clínica médica fictícia que precisa de um aplicativo para gestão de consultas. O aplicativo deve possuir funcionalidades que permitam o cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas.

Inicialmente será elaborado apenas o desenvolvimento da API Rest desse projeto.


⚙️ Funcionalidades

  - [x] CRUD de médicos
  - [x] CRUD de pacientes
  - [ ] Login com autenticação
  - [ ] Recuperação de senha
  - [ ] Agendamento de consultas
  - [ ] Cancelamento de consultas


<details> <summary> Documentação das funcionalidades da aplicação:</summary>

    - Cadastro de médicos:
      O sistema deve possuir uma funcionalidade de cadastro de médicos, na qual as seguintes informações deverão ser preenchidas:
        - Nome
        - E-mail
        - Telefone
        - CRM
        - Especialidade (Ortopedia, Cardiologia, Ginecologia ou Dermatologia)
        - Endereço completo (logradouro, número, complemento, bairro, cidade, UF e CEP)
      Todas as informações são de preenchimento obrigatório, exceto o número e o complemento do endereço.

    - Listagem de médicos:
      O sistema deve possuir uma funcionalidade de listagem de médicos, na qual as seguintes informações, de cada um dos médicos cadastrados, deverão ser exibidas:
        - Nome
        - E-mail
        - CRM
        - Especialidade
      A listagem deve ser ordenada pelo nome do médico, de maneira crescente, bem como ser paginada, trazendo 10 registros por página.

    - Atualização de médicos:
      O sistema deve possuir uma funcionalidade de atualização de dados cadastrais de médicos, na qual as seguintes informações poderão ser atualizadas:
        - Nome
        - Telefone
        - Endereço
      As seguintes regras de negócio devem ser validadas pelo sistema:
        - Não permitir a alteração do e-mail do médico;
        - Não permitir a alteração do CRM do médico;
        - Não permitir a alteração da Especialidade do médico.

    - Exclusão de médicos:
      O sistema deve possuir uma funcionalidade que permita a exclusão de médicos cadastrados.
      As seguintes regras de negócio devem ser validadas pelo sistema:
        - A exclusão não deve apagar os dados do médico, mas torná-lo como "inativo" no sistema.

</details>

🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

    Java 17
    Spring Boot 3
    Maven
    MySQL
    Hibernate
    Flyway
    Lombok

📝 Licença

Projeto base desenvolvido por Alura (cursos de formação) e adaptado para versão de uso pessoal.
