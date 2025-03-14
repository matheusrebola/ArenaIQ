📊 Sobre o Projeto

Este projeto visa a criação de uma Inteligência Artificial para assistir e analisar partidas de futebol em tempo real e em batch. A IA registra eventos do jogo (passes, finalizações, assistências, faltas, etc.), movimentações táticas e formações, gerando insights valiosos para melhorar a visão técnica e tática de um time.

🌐 Arquitetura Geral

Microserviços: Implementados em Java (Spring) e Scala, responsáveis por receber, processar e persistir os dados.

Análise em Tempo Real: Utilizando Apache Spark e H2O.ai para processar e interpretar os eventos em tempo real.

Armazenamento: MongoDB e Redis para dados em tempo real, Cassandra para persistência em Data Lake.

Visualização: Integração com Grafana para monitoramento ao vivo e Tableau/PowerBI para análise profunda pós-jogo.

📂 Estrutura do Repositório

.
├── README.md               # Descrição geral do projeto
├── services/               # Microserviços (Java/Scala, Spring)
├── ai/                     # Inteligência Artificial (Python + Spark)
└── data-analysis/          # Análise de Dados (R + H2O.ai)

