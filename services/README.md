# Microserviços da Plataforma de Análise Tática

Os microserviços desta plataforma são responsáveis por cada etapa do fluxo de processamento de dados de partidas de futebol. A arquitetura é baseada em AWS Lambda, AWS Fargate e Amazon MSK para garantir escalabilidade e resiliência.

## Microserviços

### 1. Portal Service (API Gateway)
- Responsável por rotear todas as requisições para os microserviços.
- Implementado com AWS API Gateway.

### 2. Autenticacao Service
- Gerencia autenticação e autorização.
- Utiliza AWS Cognito para gestão de usuários e sessões.

### 3. Treino Service (AWS Lambda)
- Recebe e armazena informações de lances no DynamoDB.
- Aciona pipelines de re-treinamento automático no Amazon SageMaker.

### 4. Partida Service (AWS Lambda)
- Registra informações de transmissões ao vivo ou partidas históricas.

### 5. Encaminhamento Service (AWS Fargate)
- Recebe eventos analisados pelo Amazon Rekognition.
- Cria tópicos no Amazon MSK para processamento assíncrono.

### 6. Recebidor Service (AWS Fargate e AWS Lambda)
- Consome tópicos do Amazon MSK.
- Partidas ao vivo: Armazena em cache (Amazon ElastiCache) para análise em tempo real.
- Partidas históricas: Encaminha para persistência no Amazon Keyspaces.

### 7. Persistencia Service (AWS Fargate e AWS Lambda)
- Consome tópicos de eventos.
- Persiste os dados analisados no Amazon Keyspaces.

## Monitoramento e Observabilidade
- AWS X-Ray: Rastreamento distribuído.
- Amazon CloudWatch: Logs, métricas e alertas.

---