---
title: "Recomendações Táticas em Tempo Real"
---

Objetivo: Sugerir ajustes conforme o comportamento do adversário e a eficácia do time.

Campos para cruzar:

    formacoes + eventos.motivo

    linhas + eventos.evento

    clima, temperatura, umidade (do data lake)

    placar parcial, momento do jogo

```{r}
#conectar ao mongo
library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
linhas <- mongo(collection = "linhas", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
```

