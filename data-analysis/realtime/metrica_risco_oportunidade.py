---
title: "Métricas de Risco e Oportunidade"
---

Objetivo: Detectar onde o time corre mais riscos ou pode gerar oportunidades.

Campos para cruzar:

    eventos.evento + evento.motivo + posição no campo

    linhas.altura, linhas.largura

    formacoes.modo, compactacao

    erro de passe, finalização, recuperação


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

