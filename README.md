# README.md para o Projeto BlogApplication

## Estrutura do Projeto
O projeto `BlogApplication` é uma aplicação Spring Boot para gerenciar um blog através de uma API REST. A estrutura de pastas é organizada da seguinte forma:

```
BlogApplication/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cwcdev/
│   │   │           └── blog/
│   │   │               ├── BlogApplication.java
│   │   │               ├── controller/
│   │   │               │   └── BlogController.java
│   │   │               ├── model/
│   │   │               │   └── Blog.java
│   │   │               ├── repository/
│   │   │               │   └── BlogRepository.java
│   │   │               ├── service/
│   │   │               │   └── BlogService.java
│   │   │               └── ServletInitializer.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── cwcdev/
│                   └── blog/
│                       └── BlogApplicationTests.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## Linguagens e Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações em Java.
- **Maven**: Ferramenta de gerenciamento de projetos e dependências.

## Dependências
Este projeto utiliza várias dependências do Spring Boot, tais como:
- Spring Web
- Spring Data JPA
- H2 Database (banco de dados em memória para testes)
- Spring Boot Test

### Instruções de Instalação
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-repositorio/BlogApplication.git
   ```
2. Navegue para o diretório do projeto:
   ```sh
   cd BlogApplication
   ```
3. Execute o Maven para instalar as dependências:
   ```sh
   mvn clean install
   ```

## Executando o Projeto
Para executar o projeto localmente:
```sh
mvn spring-boot:run
```
A API estará acessível via `http://localhost:8080`.

## Executando os Testes
Para executar os testes:
```sh
mvn test
```
Esta comando irá rodar os testes escritos em `BlogApplicationTests.java`.

## Principais Componentes e Responsabilidades
- **BlogApplication.java**: Classe principal que inicia a aplicação.
- **BlogController.java**: Controlador que gerencia as requisições HTTP para blogs.
- **Blog.java**: Modelo de dados representando um blog.
- **BlogRepository.java**: Interface de repositório para operações CRUD com a entidade `Blog`.
- **BlogService.java**: Serviço que contém a lógica de negócios para gerenciar blogs.
- **ServletInitializer.java**: Classe de inicialização da aplicação quando executada como um War em servidores de aplicação.

## Exemplos de Uso
Para obter todos os blogs:
```http
GET /api/blogs
```

Para criar um novo blog:
```http
POST /api/blogs
Content-Type: application/json

{
  "title": "Novo Blog",
  "body": "Conteúdo do blog aqui"
}
```

## Contribuição
Para contribuir com este projeto, siga as boas práticas:
- Escreva código limpo e bem documentado.
- Siga o padrão de código existente.
- Escreva testes para novas funcionalidades.
- Crie pull requests claros com uma descrição adequada das mudanças propostas.

---
Este README oferece uma visão geral de como o projeto está estruturado e de como ele pode ser utilizado e extendido. Boa codificação!