package com.planealo.negocio.customers.models.mapper;

import java.time.LocalDateTime;

import org.mapstruct.AfterMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.planealo.negocio.customers.models.dto.CustomerDTOlogin;
import com.planealo.negocio.customers.models.dto.CustomerDTOperfil;
import com.planealo.negocio.customers.models.dto.CustomerDTOresumen;
import com.planealo.negocio.customers.models.entity.Customer;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
	// No se ya si esto es estar mas limpio o sucio con el lenguje de alto nivel...
	
	// 	################### DTOperfil ########################################
	
	@Mapping(target = "id", ignore = true) // Ignorar mapeo
	@Mapping(source = "pass", target = "password")
	@Mapping(source = "ref", target = "referencia")
	@Mapping(target = "fechaCreacion", ignore = true)
	@Mapping(target = "fechaUltimaActualizacion", ignore = true)
	@Mapping(target = "ultimoInicioSesion", ignore = true)
	Customer perfilToCustomer(CustomerDTOperfil usuarioDTO);

	@InheritInverseConfiguration
	@Mapping(target = "pass", ignore = true)
	CustomerDTOperfil toDTOperfil(Customer usuario);

	//	#################### DTOresumen #######################################
	
	@Mapping(target = "id", ignore = true) 
	@Mapping(target = "password", ignore = true) 
	@Mapping(target = "email", ignore = true) 
	@Mapping(source = "ref", target = "referencia")
	@Mapping(target = "fechaCreacion", ignore = true)
	@Mapping(target = "fechaUltimaActualizacion", ignore = true)
	@Mapping(target = "ultimoInicioSesion", ignore = true)
	Customer resumenToCustomer(CustomerDTOresumen usuarioDTO);
	
	@InheritInverseConfiguration
	CustomerDTOresumen toDTOresumen(Customer usuario);
	
	//	################### DTOlogin ###########################################
	 	
	@Mapping(target = "id", ignore = true) 
	@Mapping(target = "nombre", ignore = true) 
	@Mapping(source = "pass", target = "password") 
	@Mapping(target = "referencia", ignore = true)
	@Mapping(target = "fechaCreacion", ignore = true)
	@Mapping(target = "fechaUltimaActualizacion", ignore = true)
	@Mapping(target = "ultimoInicioSesion", ignore = true)
	Customer loginToCustomer(CustomerDTOlogin usuarioDTO);
	
	// Esta en verdad no se usa deberia quitarla
	@InheritInverseConfiguration
	@Mapping(target = "pass", ignore = true)
	CustomerDTOlogin toDTOlogin(Customer usuario);

	
	
	// TODO issue -> No setea fechas despues de mapear.
	/**
	 * Metodo que ejecuta despues mapear un dto a usuario. Si se crea es solo en el
	 * caso de que se guarde por ahora.
	 * 
	 * @param usuario
	 */
	@AfterMapping
	default void setFechas(@MappingTarget Customer usuario) {
		usuario.setFechaCreacion(LocalDateTime.now());
		usuario.setFechaUltimaActualizacion(LocalDateTime.now());
		usuario.setUltimoInicioSesion(LocalDateTime.now());
	}
}
