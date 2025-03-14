# IA para Análise de Imagens em Partidas de Futebol

Este módulo é responsável por identificar e classificar eventos em partidas de futebol através de visão computacional.

## Tecnologias Utilizadas

- **Amazon Rekognition**: Análise de vídeo em tempo real e histórico.
- **Amazon SageMaker**: Treinamento e implantação de modelos de Deep Learning.
- **Python**: Frameworks como TensorFlow, PyTorch e OpenCV para processamento de imagens.

## Pipeline de Treinamento

1. **Coleta de Dados**: Lances de partidas registrados no DynamoDB.
2. **Treinamento**: Pipeline automatizado com Amazon SageMaker Pipelines.
3. **Implantação**: O modelo é implantado no Rekognition para inferência em tempo real.

## Fluxo de Processamento

1. O Partida Service registra o link de transmissão.
2. O Amazon Rekognition processa os vídeos e gera eventos.
3. Os eventos são publicados no Amazon MSK pelo Encaminhamento Service.
4. O Recebidor Service processa e encaminha os dados para análise em tempo real ou persistência.