package com.planealo.negocio.plan.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	/*
	 * Particiones: Un tópico puede estar dividido en múltiples particiones, 
	 * 				y cada partición es un log secuencial ordenado.
	 * 
	 * Replicas: Copias de una partición. Cada partición en un tópico puede 
	 * 			 tener múltiples réplicas distribuidas en diferentes brokers.
	 * 
	 * Estos parametros sirver para manejar la carga de trabajo de manera eficiente
	 *  y asegurar la disponibilidad de los datos.
	 */
	@Bean
	public NewTopic generateTopi() {
		return TopicBuilder.name("Nombre_del_Topic")
					.partitions(2) // Num particiones
					.replicas(2) // Num replicas
					.build();
	}
	
}
