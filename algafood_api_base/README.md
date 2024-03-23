# Alaga

- Rodar projeto via terminal
```java -jar target/algafood_api_base-0.0.1-SNAPSHOT.jar```

- Limpar builds anteriores
```./mvnw clean```

- Herda configurações de outros locais
`<parent>`

- Suporte ao build do projeto
`<plugin>`

- Hierarquia de dependências
`./mvnw dependency:tree`
`./mvnw dependency:resouve`

> @Controller 
- retorna uma representação da visão (HTML, XML, JSON etc.), enquanto @RestController retorna diretamente dados no formato especificado (JSON, XML etc.).

> @RestController 

- é útil para a construção de APIs RESTful, enquanto @Controller é mais comumente usado para controladores que renderizam visões para páginas da web.

> Em resumo, se você está criando um controlador que irá retornar dados para uma aplicação cliente (como uma API REST), você geralmente usará @RestController. Se você está criando um controlador que renderizará uma visão para uma página da web, você usará @Controller.