# Projeto Microsservices

Sistema de microsserviços Java com Spring Boot e Spring Cloud.

Os microsserviços são registrados em um "Discovery Server" (Eureka), de modo que a comunicação entre eles é feita pelo nome do microsserviço. Além disso, as requisições são feitas em um API Gateway (Zuul), responsável por rotear e autorizar as requisições, com autenticação e autorização, usando OAuth e tokens JWT. 

## Modelo conceitual do projeto

![Modelo Conceitual](https://github.com/igor-lourenco/projeto-microsservices/blob/docker/assets/imgs/uml_microservice.png?raw=true)

## Mapa do projeto

![Mapa](https://github.com/igor-lourenco/projeto-microsservices/blob/docker/assets/imgs/mapa_microservice.png?raw=true)

## Tecnologias utilizadas

- Feign para requisições de API entre microsserviços
- Ribbon para balanceamento de carga
- Servidor Eureka para registro dos microsserviços
- API Gateway Zuul para roteamento e autorização
- Hystrix para tolerância a falhas
- OAuth e JWT para autenticação e autorização
- Servidor de configuração centralizada com dados em repositório Git
- Geração de containers Docker para os microsserviços e bases de dados

## Back end
- Java 11
- Spring Boot
- Spring Cloud
- JWT
- OAuth2
- JPA / Hibernate
- Maven

# Autor

Igor Lourenço Dos Santos

https://www.linkedin.com/in/igor-lourenco-santos













