---
title: "Machine Learning e Alertas Inteligentes"
---

Objetivo: Criar alertas automáticos para detectar padrões de risco ou sucesso.

Campos para cruzar:

    Todos os de eventos, formações, linhas

    desempenho histórico, resultado final, placar parcial

    clima, temperatura, umidade

    jogadores em campo, função, posição

    tecnico, estilo, pressão adversária


```{r}
library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
linhas <- mongo(collection = "linhas", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
tecnicos <- mongo(collection = "tecnicos", db = "datalake", url = uri)
```

```{r}
jogadores <- jogadores$find()
jogadores
```

