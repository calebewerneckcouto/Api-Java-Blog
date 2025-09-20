# README.md para Projeto de Blog - Spring Boot

## Estrutura do Projeto e Pastas

Este projeto utiliza o framework Spring Boot para uma aplicação de blog. A estrutura das pastas está organizada da seguinte forma:

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cwcdev
│   │   │           └── blog
│   │   │               ├── BlogApplication.java
│   │   │               ├── controller
│   │   │               │   └── BlogController.java
│   │   │               ├── model
│   │   │               │   └── Blog.java
│   │   │               ├── repository
│   │   │               │   └── BlogRepository.java
│   │   │               ├── service
│   │   │               │   └── BlogService.java
│   │   │               ├── exception
│   │   │               │   └── ControleExcecoes.java
│   │   │               └── ServletInitializer.java
│   │   └── resources
│   │       ├── application.properties
│   └── test
│       └── java
│           └── com
│               └── cwcdev
│                   └── blog
│                       └── BlogApplicationTests.java
├── .gitignore
├── pom.xml
└── README.md
```

## Linguagens de Programação Usadas

- **Java**: A linguagem principal usada para desenvolver a aplicação.

## Dependências e Instruções de Instalação

Este projeto utiliza Maven como sistema de gestão de dependências. Para instalar as dependências necessárias, basta executar o seguinte comando na raiz do projeto:

```sh
mvn clean install
```

As principais dependências incluem:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Test
- H2 Database (para testes)

## Como Rodar o Projeto e Executar Testes

Para rodar a aplicação, execute:

```sh
mvn spring-boot:run
```

Para executar os testes:

```sh
mvn test
```

## Descrição Detalhada dos Arquivos de Código

### BlogApplication.java

Classe principal do Spring Boot que inicia a aplicação. Ela contém o método `main` que executa a aplicação utilizando `SpringApplication.run()`.

### BlogController.java

Controlador REST responsável pela gestão dos blogs. Ele manipula requisições HTTP para criar, atualizar, deletar e buscar blogs usando o `BlogService`.

### Blog.java

Modelo representando a entidade Blog no banco de dados. Contém atributos como `id`, `title` e `body` com respectivos getters e setters.

### BlogRepository.java

Interface do repositório para interagir com a tabela de blogs no banco de dados, extendendo `JpaRepository`.

### BlogService.java

Camada de serviço que contém lógica de negócios para manipular dados de blogs. Interage com `BlogRepository` para CRUD operações.

### ControleExcecoes.java

Classe responsável pelo tratamento global de exceções nos controladores REST, fornecendo respostas HTTP apropriadas.

### ServletInitializer.java

Classe para configurar a aplicação quando implantada como um WAR em servidores de servlets.

## Exemplos de Uso

A aplicação suporta várias operações relacionadas a blogs via API REST:

- **GET /api/blogs**: Lista todos os blogs.
- **GET /api/blogs/{id}**: Busca um blog por ID.
- **POST /api/blogs**: Cria um novo blog.
- **PUT /api/blogs/{id}**: Atualiza um blog existente.
- **DELETE /api/blogs/{id}**: Remove um blog pelo ID.

## Boas Práticas e Dicas para Contribuir

- Siga a convenção de código de Java e Spring Boot.
- Escreva testes para cobrir novas funcionalidades.
- Faça commits pequenos e bem descritos.
- Crie pull requests com descrições claras das mudanças propostas.
- Use anotações como `@Transactional` e `@Valid` para garantir a consistência e validação dos dados.

---

Este `README.md` fornece uma visão geral completa para novos colaboradores, explicando como a aplicação é estruturada, como configurá-la e executá-la, além de descrever brevemente cada componente chave e suas responsabilidades.