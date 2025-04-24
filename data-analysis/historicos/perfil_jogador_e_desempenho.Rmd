---
title: "Jogador como Indivíduo"
---

Objetivo: Análise do jogador como indivíduo e em grupo
Perguntas:

    Jogadores com quais características físicas e psicológicas têm maior impacto?

    Qual é a função tática ideal para cada tipo de jogador?

    Certos perfis rendem mais sob clima adverso ou jogos fora de casa?

📌 Insight: Mapear o perfil de jogador ideal para determinadas funções/táticas/climas.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

jogadores <- mongo(collection = "jogadores", db = "datalake", url = uri)
eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
movimentacoes <- mongo(collection = "movimentacoes", db = "datalake", url = uri)

```
