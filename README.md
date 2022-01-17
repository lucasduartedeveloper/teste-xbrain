# Teste:
Desenvolver um serviço que seja capaz de gerar uma venda.
Uma venda é composta por id, data da venda, valor, vendedor id e vendedor nome.

https://teste-xbrain.herokuapp.com/

# Sua tarefa é desenvolver os serviços REST abaixo:
- Criar uma nova venda

POST https://teste-xbrain.herokuapp.com/api/vendedores
```
{
   "nome" : "Vendedor A"
}
```

POST https://teste-xbrain.herokuapp.com/api/vendas
```
{
   "vendedor" : {
     "id" : 1,
   },
   "descricao" : "Coisas",
   "valor" : 10.00
}
```

- Retornar a lista de vendedores com os campos: nome, total de vendas do vendedor e média de vendas diária, conforme o período informado por parâmetro 

GET https://teste-xbrain.herokuapp.com/api/vendedores/vendas?dataInicial=17/01/2022&dataFinal=17/01/2022
```
[
{
    "id": 1,
    "nome": "Vendedor A",
    "vendasTotal": 30.0,
    "vendasPeriodo": 30.0
  },
  {
    "id": 2,
    "nome": "Vendedor B",
    "vendasTotal": 20.0,
    "vendasPeriodo": 20.0
  },
  {
    "id": 3,
    "nome": "Vendedor C",
    "vendasTotal": 10.0,
    "vendasPeriodo": 10.0
  }
]
```

# Instruções:
Gostaríamos de ver o histórico de seus commits.
Vamos avaliar a maneira que você escreveu seu código, a solução apresentada e a cobertura de testes automatizados.
Caso encontre algum impedimento no decorrer do desenvolvimento, entregue da maneira que preferir e faça uma explicação sobre o impedimento.
Avaliaremos também sua postura, honestidade e a maneira que resolve problemas.
Não é necessário implementar nenhum tipo de autenticação
Ao finalizar subir o projeto no github e nos enviar o link por email.
Nos retornar dentro de 7 dias, iremos analisar o projeto e agendar uma entrevista.  

