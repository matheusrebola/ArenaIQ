📦 README - Serviços (services/)

🛠️ Sobre os Serviços

Os microserviços são responsáveis por gerenciar o fluxo de dados desde a recepção dos eventos em tempo real até a persistência no Data Lake. A arquitetura é baseada em Spring Cloud para escalar e garantir resiliência.

🔧 Tecnologias Utilizadas

Linguagens: Java (Spring Boot) e Scala

Frameworks: Spring WebFlux, Spring Cloud Gateway, Resilience4j

Mensageria: Apache Kafka (Saga Orquestrada e Ordenada)

Armazenamento: MongoDB, Redis, Cassandra

📊 Principais Serviços

Register Service: Recebe os eventos do jogo e armazena temporariamente.

Persistence Service: Persiste os dados estruturados no Data Lake.

📌 Como Executar

Configure o ambiente com Java 17 ou superior.

Execute os serviços via Script Python:

python3 run_servcices.py
