package com.planealo.negocio.customers.models.mapper;

import com.planealo.negocio.customers.models.dto.CustomerDTO;
import com.planealo.negocio.customers.models.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-18T22:56:21+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240215-1558, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO usuarioToUsuarioDTO(Customer usuario) {
        if ( usuario == null ) {
            return null;
        }

        String ref = null;
        String nombre = null;
        String email = null;

        ref = usuario.getReferencia();
        nombre = usuario.getNombre();
        email = usuario.getEmail();

        String pass = null;

        CustomerDTO customerDTO = new CustomerDTO( ref, nombre, email, pass );

        return customerDTO;
    }

    @Override
    public Customer usuarioDTOToUsuario(CustomerDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.password( usuarioDTO.pass() );
        customer.referencia( usuarioDTO.ref() );
        customer.email( usuarioDTO.email() );
        customer.nombre( usuarioDTO.nombre() );

        return customer.build();
    }
}
