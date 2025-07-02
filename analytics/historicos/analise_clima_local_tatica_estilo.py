---
title: "Impacto Clima"
---

Objetivo: Impacto de clima, temperatura, umidade e localidade na tática e estilo de jogo
Perguntas:

    Certas formações táticas são mais eficazes em temperaturas elevadas?

    A umidade influencia o ritmo de jogo e a compactação das linhas?

    Há diferenças de estilo entre jogos realizados em locais diferentes?
    
📌 Insight: Identificar se climas específicos favorecem certas táticas ou jogadores (ex: clima quente → menor pressão, menos velocidade).
    

```{r}
install.packages("mongolite")
library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

#Partidas.local, dataHora, clima, temperatura, umidade
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
linhas <- mongo(collection = "linhas", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
movimentacoes <- mongo(collection = "movimentacoes", db = "datalake", url = uri)
elencos <- mongo(collection = "elencos", db = "datalake", url = uri)
jogadoreselenco <- mongo(collection = "jogadoreselenco", db = "datalake", url = uri)
jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)

```

