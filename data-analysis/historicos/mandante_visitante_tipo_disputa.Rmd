---
title: "Mandante Vs Visitante"
---
Objetivo: Análise de desempenho como mandante vs visitante por tipo de disputa
Perguntas:

    Quais jogadores e técnicos mantêm alto desempenho como visitantes?

    O tipo de disputa (mata-mata vs pontos corridos) altera a escolha de formação?

    Existe correlação entre jogar fora de casa e aplicar um estilo mais defensivo?

📌 Insight: Identificar quem lida melhor com a pressão da torcida e se o tipo de disputa afeta performance.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
competicoes <- mongo(collection = "competicoes", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
tecnicos <- mongo(collection = "tecnicos", db = "datalake", url = uri)
```

