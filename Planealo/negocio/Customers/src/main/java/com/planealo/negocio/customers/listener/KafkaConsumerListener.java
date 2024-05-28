package com.planealo.negocio.customers.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.planealo.negocio.customers.utils.ConstTopics;

@Configuration
public class KafkaConsumerListener {

//	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//	
//	@KafkaListener(topics = {ConstTopics.Topic_Usuario}, groupId = "group-get-users")
//	public void listenerPlanes(String mensaje) {
//		LOGGER.info("Mensaje Recibido: "+ mensaje);
//	}
	
	/*
	 * Kafkalistener
	 * -> Topics : Asignar los topics para subscribirse a el
	 * -> groupId: Varios listener pueden estar operando en un mismo topic 
	 * 				con varios identificadores, ahora mismo solo hay un listener por lo tanto
	 * 				esta interaccion no se usa. PERO se pone porque si no tiende a no funcionar....
	 */
	
}
