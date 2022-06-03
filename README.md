##Estrutura do Projeto

| Pacote | Descrição |
|---|---|
| model | Camada que contém as entidades da aplicação. |
| dto | Camada que contém os dtos da aplicação. |
| repository | Camada que contém os repositórios da aplicação com base no Spring Data JPA. |
| service | Camada que contém a regra de negócio e a comunicação com o banco de dados via repositórios. |
| controller | Camada que contém os recursos https da API. |
| security | Camada que contém a configuração de segurança da aplicação. |

| Classe | Descrição |
|---|---|
| SwaggerConfig | Responsável pela documentação da  API. |
| JWTObject | Representa um Objeto correspondente da estrutura JWT. |
| JWTCreator | Responsável por gerar o Token com base no Objeto e/ou instanciar o Objeto JWT com base no Token. |

