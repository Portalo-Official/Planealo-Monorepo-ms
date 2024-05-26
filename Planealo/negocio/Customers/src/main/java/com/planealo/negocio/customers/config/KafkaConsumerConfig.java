package com.planealo.negocio.customers.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;


@Configuration
public class KafkaConsumerConfig {

	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	/*
	 * Configurar las propiedades del LEctor (consumidor)
	 * - Conectar al servidor Kafka
	 * - Deserializar clave y valor del mensaje
	 */
	public Map<String, Object> consumerConfig(){
		
		Map<String, Object> properties = new HashMap<>();
		// Conectar al servidor kafka
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		// Serializar la clave
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// Serializar el objeto
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// StringSerializer.class de kafka, no de jackson

		return properties;
	}
	
	/*
	 * ConsumerFactory -> Utiliza por dentro el patron Factory. 
	 * 
	 * Esto no provee de un Objeto Consumer que se va a encargar de
	 * escuchar los mensajes. 
	 */
	@Bean
	public ConsumerFactory<String, String> consumerFactory(){
		return new DefaultKafkaConsumerFactory<>(consumerConfig());
	}
	
	
	
	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> consumer(){
		
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		
		factory.setConsumerFactory(consumerFactory());
		
		return factory;
	}
	
	/* Crear el consumidor:
	 * 
	 * KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>>
	 * 
	 * ConcurrentMessageListenerContainer<K, V> 
	 * 			K: Clave del mensaje
	 * 			V: Valor del mensaje
	 * 
	 */
	
}
