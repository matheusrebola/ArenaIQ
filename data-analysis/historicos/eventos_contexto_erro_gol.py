---
title: "Encadeamento de Ações"
---

Objetivo: Encadeamento de ações, erros e geração de gols
Perguntas:

    Quais sequências de eventos mais comumente resultam em gols?

    Quais eventos precedem perdas de posse em zonas perigosas?

    Que tipo de evento (ou jogador) sofre mais com pressão adversária?

📌 Insight: Analisar causa-consequência de ações em campo, entender zonas críticas de erro ou sucesso.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
movimentacoes <- mongo(collection = "movimentacoes", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
linhas <- mongo(collection = "linhas", db = "datalake", url = uri)
```

