package com.planealo.negocio.plan.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.planealo.negocio.plan.service.impl.PlanMemberServiceImpl;
import com.planealo.negocio.plan.service.impl.PlanServiceImpl;
import com.planealo.negocio.plan.utils.ConstTopics;


@Configuration
public class KafkaConsumerListener {
	@Autowired
	private  PlanServiceImpl planServiceImpl;
	@Autowired
	private PlanMemberServiceImpl planMemberServiceImpl;
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@KafkaListener(topics = {ConstTopics.Topic_Borrar_Usuario}, groupId = "group-get-users")
	public void listenerPlanes(String referenciaUsuario) {
		
		
		LOGGER.info("Usuario: "+ referenciaUsuario+" borrado de todos los Planes");
	}
	
	/*
	 * Kafkalistener
	 * -> Topics : Asignar los topics para subscribirse a el
	 * -> groupId: Varios listener pueden estar operando en un mismo topic 
	 * 				con varios identificadores, ahora mismo solo hay un listener por lo tanto
	 * 				esta interaccion no se usa. PERO se pone porque si no tiende a no funcionar....
	 */
	
}
