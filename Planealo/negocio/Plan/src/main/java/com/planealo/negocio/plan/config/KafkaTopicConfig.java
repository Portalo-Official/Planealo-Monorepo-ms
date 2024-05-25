package com.planealo.negocio.plan.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.planealo.negocio.plan.utils.ConstTopics;

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
	public NewTopic generateTopic() {
		
		Map<String, String> configuracion = new HashMap<>();
		// 1) Tratamiento de borrado de los mensajes
		configuracion.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
		// 2) Tiempo de retencion de mensajes
		configuracion.put(TopicConfig.RETENTION_MS_CONFIG, ConstTopics.DIA_MILISEGUNDOS);
		// 3) Tamanio Max del Segmento dentro del topic
		configuracion.put(TopicConfig.SEGMENT_BYTES_CONFIG, ConstTopics.CUARTO_GB);
		// 4) Tamanio Max de cada mensaje
		configuracion.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, ConstTopics.TRES_MB);
		
		return TopicBuilder.name(ConstTopics.Topic_Usuario)
					.partitions(2) // Num particiones
					.replicas(2) // Num replicas
					.configs(configuracion)
					.build();
	}
	
	/* 
	 * 1) Tratamiento de borrado de los mensajes
	 * - TopicConfig.CLEANUP_POLICY_DELETE -> Borra el mensaje si no se necesita
	 * - TopicConfig.CLEANUP_POLICY_COMPACT -> mantiene le mas actual.
	 * 
	 * 2) Tiempo de retencion de mensajes (cuanto duran en el Topic)
	 * - El valor en milisegundo "86400000"-> 1 dia en milisegundos
	 * - Por defecto vienen en "-1", nunca se borran (Esto acumula mensaje y espacio).
	 *  -> Cuando pase el tiempo, seguira la politica del apartado 1)
	 *  
	 * 3) Tamanio Max del Segmento dentro del topic
	 * -> Valor en Bytes "1073741824" es un 1GB en Bytes (Por defecto) 
	 * 
	 * 4) Tamanio Max de cada mensaje
	 * -> Valor en Bytes, por defecto 1MB "1048576"
	 * 
	 * 
	 */
	
}
