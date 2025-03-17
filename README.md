# Med.care

💻 **Sobre o projeto**

Med.care é uma clínica médica fictícia que precisa de um aplicativo para gestão de consultas. O aplicativo deve possuir funcionalidades que permitam o cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas.

Inicialmente será elaborado o desenvolvimento da **API Rest** do projeto. A partir de agora, a aplicação também possui um **front-end** que se comunica com a API para exibir médicos e pacientes, com a possibilidade de navegar entre as duas views.

⚙️ **Funcionalidades**

- [x] CRUD de médicos
- [x] CRUD de pacientes
- [ ] Login com autenticação
- [ ] Recuperação de senha
- [ ] Agendamento de consultas
- [ ] Cancelamento de consultas
- [x] Interface para listar médicos
- [x] Interface para listar pacientes

<details> <summary> Documentação das funcionalidades da aplicação:</summary>

- **Cadastro de médicos:** O sistema deve possuir uma funcionalidade de cadastro de médicos, onde as seguintes informações deverão ser preenchidas:
  - Nome
  - E-mail
  - Telefone
  - CRM
  - Especialidade (Ortopedia, Cardiologia, Ginecologia ou Dermatologia)
  - Endereço completo (logradouro, número, complemento, bairro, cidade, UF e CEP)
  Todas as informações são de preenchimento obrigatório, exceto o número e o complemento do endereço.

- **Listagem de médicos:** O sistema deve permitir listar os médicos cadastrados, com as seguintes informações de cada médico:
  - Nome
  - E-mail
  - CRM
  - Especialidade
  A listagem será ordenada pelo nome e será paginada.

- **Atualização de médicos:** O sistema permite atualizar dados como nome, telefone e endereço, mas não permite alterar o e-mail, CRM ou especialidade.

- **Exclusão de médicos:** O sistema marca médicos como "inativos", sem apagá-los do banco de dados.

- **Cadastro de pacientes:** O sistema também possui uma funcionalidade de cadastro de pacientes, onde as seguintes informações devem ser preenchidas:
  - Nome
  - E-mail
  - Telefone
  - CPF
  - Endereço completo

- **Listagem de pacientes:** O sistema lista os pacientes cadastrados, com as seguintes informações:
  - Nome
  - E-mail
  - CPF
  A listagem será ordenada pelo nome e será paginada.

- **Atualização de pacientes:** O sistema permite atualizar dados de pacientes, mas não permite alterar o e-mail ou CPF.

- **Exclusão de pacientes:** Similar ao cadastro de médicos, os pacientes são marcados como "inativos".

</details>

🛠 **Tecnologias**

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest e do Front-end:

- **Back-end:**
  - Java 17
  - Spring Boot 3
  - Maven
  - MySQL
  - Hibernate
  - Flyway
  - Lombok

- **Front-end:**
  - React
  - Vite
  - Axios (para chamadas HTTP)
  - TypeScript

📁 **Estrutura do projeto**

O projeto está dividido em duas partes principais: o **back-end** (API Rest) e o **front-end** (aplicativo React). Ambas as partes são gerenciadas no mesmo repositório.

- **Diretório `backend/`**: Contém o código da API Rest.
- **Diretório `frontend/`**: Contém o código do aplicativo React para a interface.

### Como rodar o projeto

**Back-end:**

1. Acesse a pasta `backend/`:
   ```bash
   cd backend

2. Compile e rode o servidor:

bash
Copiar
Editar
./mvnw spring-boot:run

3. A API estará disponível em http://localhost:8080.

Front-end:

Acesse a pasta frontend/:

bash
Copiar
Editar
cd frontend
Instale as dependências:

bash
Copiar
Editar
npm install
Rode a aplicação:

bash
Copiar
Editar
npm run dev
A interface estará disponível em http://localhost:5173.

📝 Licença

Projeto base desenvolvido por Alura (cursos de formação) e adaptado para versão de uso pessoal.

ruby
Copiar
Editar

### Alterações feitas:
1. **Inclusão do Front-end**: Agora, o README inclui detalhes sobre o front-end em React.
2. **Tecnologias**: Adicionei as tecnologias usadas no front-end (React, Vite, Axios, TypeScript).
3. **Estrutura do Projeto**: Incluí a explicação sobre a estrutura de diretórios, mencionando as pastas `backend/` e `frontend/`.
4. **Como Rodar o Projeto**: Atualizei as instruções para rodar tanto o back-end quanto o front-end.

Esse README agora reflete que você tem tanto o back-end quanto o front-end no mesmo repositório e como configurá-los.