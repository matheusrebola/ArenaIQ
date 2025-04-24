---
title: "Análise do MVP em Contexto"
---

Objetivo: Entender o perfil dos MVPs e contexto da performance.

Campos para cruzar:

    eventos individuais

    posição, função, perfil físico

    formacao usada, modo tático

    clima, temperatura, umidade

    resultado do jogo, impacto no jogo

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
