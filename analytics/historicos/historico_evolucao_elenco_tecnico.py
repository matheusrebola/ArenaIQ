---
title: "R Notebook"
---

Objetivo: Evolução histórica de técnicos, elencos e táticas
Perguntas:

    Como a filosofia de um técnico evolui ao longo das temporadas?

    Quais combinações elenco-técnico foram mais vitoriosas historicamente?

    Existe herança tática entre elencos em diferentes temporadas?

📌 Insight: Rastrear evolução de jogadores e técnicos, herança tática e impacto de mudanças de elenco ao longo do tempo.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
tecnicos <- mongo(collection = "tecnicos", db = "datalake", url = uri)
temporadas <- mongo(collection = "temporadas", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
```

