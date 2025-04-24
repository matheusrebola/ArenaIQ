---
title: "Influência Tática"
---

Objetivo: Análise estatística e influência tática nos resultados
Perguntas:

    O que mais impacta o aproveitamento de uma equipe: formação, pressão ou clima?

    Qual é a combinação de fatores táticos que mais leva a vitórias?

    Quais métricas de evento (passe, desarme, chute) estão ligadas ao desempenho?
    
📌 Insight: Correlacionar estilo/tática do técnico com o desempenho do elenco.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
tecnicos <- mongo(collection = "tecnicos", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
formacoes <- mongo(collection = "eormacoes", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
```

