package com.planealo.negocio.plan.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration
public class KafkaProviderConfig {

	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	/*
	 * El mensaje debe tener una clave y un valor.
	 * Clave: Tipo String
	 * Valor: Puede ser cualquier objeto, pero como acabara 
	 * 		en otro microservicio es más  versatil poner Object.
	 */
	public Map<String, Object> providerConfig(){
		
		Map<String, Object> properties = new HashMap<>();
		// Conectar al servidor kafka
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		// Serializar la clave
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// Serializar el objeto
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// StringSerializer.class de kafka, no de jackson

		return properties;
	}
	
	/*
	 * Crear una factoria para crear un proveedor que envia mensajes
	 * 
	 */
	@Bean
	public ProducerFactory<String, String> providerFactory(){
		return new DefaultKafkaProducerFactory<>(providerConfig());
	}
	
	/*
	 * KafkaTemplate es la clase que nos permite publicar mensajes hacia el bus de mensajes.
	 */
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory){
		return new KafkaTemplate<>(producerFactory);
	}
	
	
}
