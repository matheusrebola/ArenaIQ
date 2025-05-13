---
title: "Desempenho por Temporada"
---

Objetivo: Desempenho em competições por temporada
Perguntas:

    Quais técnicos e jogadores se saem melhor em cada competição?

    Algum técnico tem desempenho acima da média em torneios eliminatórios?

    Existem jogadores que rendem mais em temporadas específicas?
    
📌 Insight: Avaliar quais jogadores/técnicos se saem melhor em tipos específicos de competição.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

competicoes <- mongo(collection = "competicoes", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
```
