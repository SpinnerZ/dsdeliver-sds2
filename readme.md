# Projeto DSCatalog back-end
Um CRUD simples de pedidos. Utiliza JSON para comunicação.

A api está online no Heroku:
> https://spinner-sds2.herokuapp.com

## Objetivos de aprendizado:
+ Criar projeto Spring Boot
+ Criar monorepositório Git
+ Organizar projeto em camadas
+ Criar entidades 
+ Perfis de projeto (teste, desenvolvimento e produção)
+ Seeding da base de dados
+ Criar web services REST
+ Padrão DTO
+ CRUD completo
+ Tratamento de exceções
+ Dados de auditoria
+ Paginação de dados
+ Trabalhar com Postman e Insomnia para testar as requisições

## Endpoints
> GET /products

```JSON
[
    {
      "id": 6,
      "name": "Macarrão Espaguete",
      "price": 35.9,
      "description": "Macarrão fresco espaguete com molho especial e tempero da casa.",
      "imageUri": "https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_espaguete.jpg"
    }
]
```

> GET /orders

```JSON
[
    {
      "id": 7,
      "address": "Avenida Paulista, 1500",
      "latitude": -23.56168,
      "longitude": -46.656139,
      "moment": "2021-01-01T09:00:00Z",
      "status": "PENDING",
      "products": []
    }
]
```

> POST /orders

```JSON
{
  "id": 7,
  "address": "Avenida Paulista, 1500",
  "latitude": -23.56168,
  "longitude": -46.656139,
  "moment": "2021-01-01T09:00:00Z",
  "status": "PENDING",
  "products": []
}
```

> PUT /orders/{id}/delivered

Seta o status do pedido para "entregue"
