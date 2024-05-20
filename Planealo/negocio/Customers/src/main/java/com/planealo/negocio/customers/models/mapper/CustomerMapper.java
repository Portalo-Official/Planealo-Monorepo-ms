package com.planealo.negocio.customers.models.mapper;

import java.time.LocalDateTime;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.planealo.negocio.customers.models.dto.CustomerDTO;
import com.planealo.negocio.customers.models.entity.Customer;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
	//No se ya si esto es estar mas limpio o sucio con el lenguje de alto nivel...
		@Mappings({
			@Mapping(source ="referencia", target ="ref"),
			@Mapping(target="pass", ignore = true) // Ignorar mapeo	
		})
		CustomerDTO usuarioToUsuarioDTO(Customer usuario);
		
		
		@Mapping(target ="id", ignore = true)  
		@Mapping(source="pass" ,target = "password")
		@Mapping(source ="ref", target = "referencia")
		@Mapping(target ="fechaCreacion", ignore = true) 
	    @Mapping(target ="fechaUltimaActualizacion", ignore = true)
	    @Mapping(target ="ultimoInicioSesion", ignore = true)
		Customer usuarioDTOToUsuario(CustomerDTO usuarioDTO);
		
		// TODO issue -> No setea fechas despues de mapear.
		/**
		 * Metodo que ejecuta despues mapear un dto a usuario. 
		 * Si se crea es solo en el caso de que se guarde por ahora.
		 * @param usuario
		 */
	    @AfterMapping
	    default void setFechas(@MappingTarget Customer usuario) {
	        usuario.setFechaCreacion(LocalDateTime.now());
	        usuario.setFechaUltimaActualizacion(LocalDateTime.now());
	        usuario.setUltimoInicioSesion(LocalDateTime.now());
	    }
}
