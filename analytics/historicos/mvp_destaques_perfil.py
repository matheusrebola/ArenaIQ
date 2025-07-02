---
title: "Perfil e contexto dos MVPs"
---

Objetivo: Perfil e contexto dos MVPs
Perguntas:

    Que atributos físicos, táticos ou de personalidade são comuns entre MVPs?

    Em que tipo de partidas (clima, competição, localidade) os MVPs se destacam?

    O que separa estatisticamente um jogador comum de um MVP?
    
📌 Insight: Encontrar o que separa os MVPs dos demais em termos de estilo, desempenho e condições da partida.

```{r}
#library(mongolite)

uri <- "mongodb://datalake:datalake@localhost:61000/datalake"

eventos <- mongo(collection = "eventos", db = "datalake", url = uri)
resultados <- mongo(collection = "resultados", db = "datalake", url = uri)
formacoes <- mongo(collection = "formacoes", db = "datalake", url = uri)
partidas <- mongo(collection = "partidas", db = "datalake", url = uri)
```

