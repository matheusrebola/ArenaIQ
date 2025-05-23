---
title: "Diagnóstico Tático Instantâneo"
---

Objetivo: Entender o comportamento do time ao vivo.

Campos para cruzar:

    eventos.evento

    eventos.ator, eventos.receptor

    formacoes.formacao, formacoes.modo, formacoes.compactacao

    linhas.linha, linhas.altura, linhas.largura

    tempo (timestamp ou minuto)

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
linhas <- mongo(collection = "linhas", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
```

