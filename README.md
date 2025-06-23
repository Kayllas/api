# Med.care 🏥

## 💻 Sobre o projeto

Med.care é uma clínica médica fictícia que precisa de um sistema para gestão de consultas. O sistema permite o cadastro de médicos, pacientes e futuramente o agendamento de consultas. A aplicação é composta por uma **API REST em Java com Spring Boot** e um **front-end em React**.

---

## ⚙️ Funcionalidades

- [x] CRUD de médicos  
- [x] CRUD de pacientes  
- [x] Login com autenticação  
- [ ] Recuperação de senha  
- [ ] Agendamento de consultas  
- [ ] Cancelamento de consultas  
- [x] Interface para listar médicos  
- [x] Interface para listar pacientes  
- [x] Documentação da API com Swagger

<details>
<summary>📄 Detalhes técnicos das funcionalidades</summary>

### Médicos
- Cadastro (nome, e-mail, telefone, CRM, especialidade, endereço)
- Listagem com paginação
- Atualização (exceto e-mail, CRM e especialidade)
- Inativação lógica

### Pacientes
- Cadastro (nome, e-mail, telefone, CPF, endereço)
- Listagem com paginação
- Atualização (exceto e-mail e CPF)
- Inativação lógica

</details>

---

## 🐳 Como rodar com Docker

### Pré-requisitos:
- Docker + Docker Compose instalados

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/medcare.git
cd medcare
```

### 2. Suba os containers
```bash
docker-compose up --build
```

Isso iniciará:
- O banco MySQL no container `mysql-db`
- A aplicação Java no container `medcare-api`

### 3. Acesse no navegador:
- API: `http://localhost:8080`
- Swagger: `http://localhost:8080/swagger-ui.html`

---

## 🌐 Front-end (opcional)

Se quiser rodar a interface React localmente:

```bash
cd my-frontend
npm install
npm run dev
```

Interface disponível em `http://localhost:5173`

---

## 🧾 Documentação Swagger

Acesse [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) para explorar a API e testar os endpoints diretamente no navegador.

---

## 🧰 Tecnologias Utilizadas

### Back-end:
- Java 17
- Spring Boot 3
- MySQL 8
- Hibernate + Flyway
- Lombok
- Swagger OpenAPI
- Docker

### Front-end:
- React + Vite + TypeScript
- Axios

---

## 📁 Estrutura

```
/api            --> código Java (API)
my-frontend/    --> código React (interface)
docker-compose.yml
Dockerfile
README.md
```

---

## 📝 Licença

Projeto baseado em formação da [Alura](https://www.alura.com.br/), adaptado para fins de estudo pessoal.