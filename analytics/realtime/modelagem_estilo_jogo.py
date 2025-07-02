---
title: "Modelagem de Estilo de Jogo por Time/Treinador"
---

Objetivo: Entender o DNA tático de um time ou técnico ao longo do tempo.

Campos para cruzar:

    formacoes + modo + compactacao

    linhas por tempo de jogo

    eventos + motivos

    tecnico + temporada

    clima, temperatura, umidade


```{r}
#install.packages("mongolite")
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


```{r}
eventos <- eventos$find()
class(eventos)
eventos
```

