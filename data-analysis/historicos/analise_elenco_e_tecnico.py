---
title: "Técnico e Elenco"
---

Objetivo: Relação entre o perfil do técnico e o elenco que ele lidera
Perguntas:

    Técnicos com determinada filosofia preferem elencos com que tipo de perfil?

    Como o técnico influencia o aproveitamento de jogadores específicos?

    Qual a variação de performance de um mesmo elenco sob técnicos diferentes?
    
📌 Insight: Correlacionar estilo/tática do técnico com o desempenho do elenco.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

# Selecionar uma collection (por exemplo, "Eventos")
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
tecnicos <- mongo(collection = "tecnicos", db = "datalake", url = uri)

```
