<div align="center">

# Twitter simplificado com Spring Security e OAuth2-ResourceServer

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

</div>

## Descrição

Este projeto é uma implementação simplificada do Twitter, onde usuários podem criar contas, fazer login, postar "tweets" e visualizar um feed de tweets. A aplicação utiliza o Spring Boot como framework principal e o Spring Security para gerenciar autenticação e autorização via tokens JWT. A autenticação é implementada usando o OAuth2 Resource Server, e a aplicação está preparada para funcionar em ambientes containerizados usando Docker.

## Tecnologias e Dependências do projeto

- **Java:** Linguagem usada no projeto.
- **Spring Boot:** Framework para construção de aplicações web e microserviços.
- **Spring Web:** Para criação de APIs RESTful.
- **Spring Security:** Para gerenciar autenticação e autorização.
- **OAuth2 Resource Server:** Implementação de autenticação baseada em tokens JWT.
- **MySQL:** Banco de dados relacional utilizado.
- **Docker:** Containerização da do banco de dados.
- **Maven:** Ferramenta de build e gerenciamento de dependências.

## Teste o projeto

1. Certifique-se de que o Docker e o Docker Compose estejam instalados em sua máquina.
2. Navegue até o diretório do projeto em seu terminal e execute o seguinte comando para iniciar os contêineres:
    ```bash
    docker-compose up -d
    ```
3. Inicie o aplicativo Spring Boot usando o comando:
    ```bash
    mvn spring-boot:run
    ```
4. Teste os endpoints.

## Endpoints para teste

| Route                          | Description                                             |
|--------------------------------|---------------------------------------------------------|
| <kbd>POST /login</kbd>         | Realiza login e retorna um token JWT.                   |
| <kbd>POST /users</kbd>         | Cria um novo usuário.                                   |
| <kbd>POST /tweets</kbd>        | Cria um novo tweet.                                     |
| <kbd>GET /feed</kbd>           | Lista os tweets mais recentes em formato paginado.      |
| <kbd>DELETE /tweets/{id}</kbd> | Exclui um tweet existente.                              |
| <kbd>GET /users</kbd>          | Lista todos os usuários (somente para administradores). |


## Contruibuição

- Para contribuir, bifurque este repositório e envie suas alterações por meio de pull requests.
- Para relatórios de bugs ou sugestões de melhorias, abra um problema na página do projeto.


