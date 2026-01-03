# 📦 Estudos API – Spring Boot

API REST desenvolvida em **Spring Boot**, com foco em **boas práticas de arquitetura**, organização de código e documentação profissional.  
O projeto simula o gerenciamento de produtos e é utilizado como **portfólio backend**.

---

## 🎯 Objetivo do Projeto

- Consolidar fundamentos de desenvolvimento backend
- Aplicar arquitetura em camadas
- Trabalhar com DTOs para segurança e organização
- Integrar aplicação com PostgreSQL
- Documentar a API com Swagger (OpenAPI)
- Criar uma base sólida para evolução futura (Docker, Angular, segurança)

---

## 🧱 Arquitetura

O projeto segue uma arquitetura em camadas, amplamente utilizada no mercado:

Controller → Service → Repository → Banco de Dados


### Responsabilidades

- **Controller**
  - Exposição dos endpoints REST
  - Recebe e retorna dados via DTOs

- **Service**
  - Contém as regras de negócio
  - Centraliza validações e operações

- **Repository**
  - Comunicação direta com o banco de dados
  - Utiliza Spring Data JPA

- **DTO (Data Transfer Object)**
  - Controla entrada e saída de dados
  - Evita exposição direta das entidades
  - Aumenta segurança da aplicação

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Swagger / OpenAPI
- Maven

---

## 📂 Estrutura do Projeto

src/main/java
└── io.github.austinmff.estudosapi
├── controller
├── dto
├── model
├── repository
└── service

---

## 🔗 Endpoints da API

### Produtos

| Método | Endpoint | Descrição |
|------|--------|---------|
| POST | `/produtos` | Cadastrar produto |
| GET | `/produtos` | Listar todos os produtos |
| GET | `/produtos/{id}` | Buscar produto por ID |
| PUT | `/produtos/{id}` | Atualizar produto |
| DELETE | `/produtos/{id}` | Remover produto |
| GET | `/produtos/buscar?nome=` | Buscar produtos por nome |

---

## 📖 Documentação (Swagger)

A API é documentada com **Swagger**, facilitando testes e entendimento dos endpoints.

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui/index.html

---

## 🗄️ Banco de Dados

- Banco de dados: **PostgreSQL**
- ORM: **Hibernate (JPA)**
- Criação automática de tabelas
- Identificadores utilizando **UUID**

---

## ▶️ Como Executar

### Pré-requisitos

- Java 17+
- Maven
- PostgreSQL

### Execução

```
git clone https://github.com/seu-usuario/estudosapi.git
cd estudosapi
./mvnw spring-boot:run
📌 Status Atual
✔ CRUD completo
✔ PostgreSQL configurado
✔ Swagger documentado
✔ Arquitetura organizada
✔ Projeto pronto para portfólio
```

### 🔮Próximos Passos

Docker e Docker Compose

Tratamento global de exceções

Validações com Bean Validation

Autenticação e autorização (JWT)

Frontend com Angular

Testes automatizados

👨‍💻 Autor
Austin Mff
Projeto desenvolvido com foco em aprendizado contínuo e crescimento profissional.
