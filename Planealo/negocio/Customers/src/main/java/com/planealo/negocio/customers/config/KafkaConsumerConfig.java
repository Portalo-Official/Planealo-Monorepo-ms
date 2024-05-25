package com.planealo.negocio.customers.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration
public class KafkaConsumerConfig {

	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	/*
	 * El mensaje debe tener una clave y un valor.
	 * Clave: Tipo String
	 * Valor: Puede ser cualquier objeto, pero como acabara 
	 * 		en otro microservicio es más  versatil poner Object.
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
	 * Crear una factoria para crear un proveedor que envia mensajes
	 * 
	 */
	@Bean
	public ProducerFactory<String, String> providerFactory(){
		return new DefaultKafkaProducerFactory<>(consumerConfig());
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory){
		return new KafkaTemplate<>(producerFactory);
	}
	
	
}
