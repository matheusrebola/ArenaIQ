# Análise de Dados Estruturados

Este módulo é responsável por processar e analisar grandes volumes de dados estruturados gerados durante as partidas.

## Arquitetura

1. **Amazon Keyspaces**: Armazena eventos analisados de forma persistente.
2. **AWS Glue**: Realiza ETL automatizado entre o Amazon Keyspaces e o Amazon EMR.
3. **Amazon EMR (Hadoop)**: Executa análises batch para gerar insights aprofundados.
4. **Amazon QuickSight**: Visualização dos resultados em dashboards interativos.

## Principais Análises
- Padrões táticos.
- Desempenho de jogadores.
- Estatísticas detalhadas de eventos.

Processos de ETL são otimizados via Glue Jobs, garantindo integração rápida e eficaz entre as fontes de dados.

---