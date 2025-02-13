package soccervs.reciever.config.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import lombok.RequiredArgsConstructor;

@EnableKafka
@Configuration
@RequiredArgsConstructor
public class KafkaConfig {
	private static final Integer PARTITION_COUNT = 1;
    private static final Integer REPLICA_COUNT = 1;

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Value("${spring.kafka.consumer.auto-offset-reset}")
    private String autoOffsetReset;

    @Value("${spring.kafka.topic.cartoes-start}")
    private String cartoesStartTopic;
    
    @Value("${spring.kafka.topic.cartoes-ending}")
    private String cartoesEndingTopic;
   
    @Value("${spring.kafka.topic.eventos-especificos-start}")
    private String eventosEspecificosStartTopic;
    
    @Value("${spring.kafka.topic.eventos-especificos-ending}")
    private String eventosEspecificosEndingTopic;
    
    @Value("${spring.kafka.topic.faltas-start}")
    private String faltasStartTopic;
    
    @Value("${spring.kafka.topic.faltas-ending}")
    private String faltasEndingTopic;
    
    @Value("${spring.kafka.topic.finalizacoes-start}")
    private String finalizacoesStartTopic;
    
    @Value("${spring.kafka.topic.finalizacoes-ending}")
    private String finalizacoesEndingTopic;
    
    @Value("${spring.kafka.topic.formacao-time-start}")
    private String formacaoTimeStartTopic;
    
    @Value("${spring.kafka.topic.formacao-time-ending}")
    private String formacaoTimeEndingTopic;
    
    @Value("${spring.kafka.topic.linha-defensiva-start}")
    private String linhaDefensivaStartTopic;
    
    @Value("${spring.kafka.topic.linha-defensiva-ending}")
    private String linhaDefensivaEndingTopic;
    
    @Value("${spring.kafka.topic.movimentacao-start}")
    private String movimentacaoStartTopic;
    
    @Value("${spring.kafka.topic.movimentacao-ending}")
    private String movimentacaoEndingTopic;
    
    @Value("${spring.kafka.topic.passes-detalhes-start}")
    private String passesDetalhesStartTopic;
    
    @Value("${spring.kafka.topic.passes-detalhes-ending}")
    private String passesDetalhesEndingTopic;
    
    @Value("${spring.kafka.topic.relacao-jogadores-start}")
    private String relacaoJogadoresStartTopic;
    
    @Value("${spring.kafka.topic.relacao-jogadores-ending}")
    private String relacaoJogadoresEndingTopic;
    
    @Bean
    ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerProps());
    }
    
    private Map<String, Object> consumerProps() {
        var props = new HashMap<String, Object>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoOffsetReset);
        return props;
    }

    @Bean
    ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerProps());
    }
    
    private Map<String, Object> producerProps() {
        var props = new HashMap<String, Object>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return props;
    }
    
    @Bean
    KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
    
    private NewTopic buildTopic(String name) {
        return TopicBuilder
            .name(name)
            .partitions(PARTITION_COUNT)
            .replicas(REPLICA_COUNT)
            .build();
    }
    
    @Bean
    NewTopic cartoesStartTopic(){
    	return buildTopic(cartoesStartTopic);
    }
    
    @Bean
    NewTopic cartoesEndingTopic(){
    	return buildTopic(cartoesEndingTopic);
    }
    
    @Bean
    NewTopic eventosEspecificosStartTopic(){
    	return buildTopic(eventosEspecificosStartTopic);
    }
    
    @Bean
    NewTopic eventosEspecificosEndingTopic(){
    	return buildTopic(eventosEspecificosEndingTopic);
    }
    
    @Bean
    NewTopic faltasStartTopic(){
    	return buildTopic(faltasStartTopic);
    }
    
    @Bean
    NewTopic faltasEndingTopic(){
    	return buildTopic(faltasEndingTopic);
    }
    
    @Bean
    NewTopic finalizacoesStartTopic(){
    	return buildTopic(finalizacoesStartTopic);
    }
    
    @Bean
    NewTopic finalizacoesEndingTopic(){
    	return buildTopic(finalizacoesEndingTopic);
    }
    
    @Bean
    NewTopic formacaoTimeStartTopic(){
    	return buildTopic(formacaoTimeStartTopic);
    }
    
    @Bean
    NewTopic formacaoTimeEndingTopic(){
    	return buildTopic(formacaoTimeEndingTopic);
    }
    
    @Bean
    NewTopic linhaDefensivaStartTopic(){
    	return buildTopic(linhaDefensivaStartTopic);
    }
    
    @Bean
    NewTopic linhaDefensivaEndingTopic(){
    	return buildTopic(linhaDefensivaEndingTopic);
    }
    
    @Bean
    NewTopic movimentacaoStartTopic(){
    	return buildTopic(movimentacaoStartTopic);
    }
    
    @Bean
    NewTopic movimentacaoEndingTopic(){
    	return buildTopic(movimentacaoEndingTopic);
    }
    
    @Bean
    NewTopic passesDetalhesStartTopic(){
    	return buildTopic(passesDetalhesStartTopic);
    }
    
    @Bean
    NewTopic passesDetalhesEndingTopic(){
    	return buildTopic(passesDetalhesEndingTopic);
    }
    
    @Bean
    NewTopic relacaoJogadoresStartTopic(){
    	return buildTopic(relacaoJogadoresStartTopic);
    }
    
    @Bean
    NewTopic relacaoJogadoresEndingTopic(){
    	return buildTopic(relacaoJogadoresEndingTopic);
    }
    
}
