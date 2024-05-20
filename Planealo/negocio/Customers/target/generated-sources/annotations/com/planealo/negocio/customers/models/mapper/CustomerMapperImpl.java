package com.planealo.negocio.customers.models.mapper;

import com.planealo.negocio.customers.models.dto.CustomerDTOlogin;
import com.planealo.negocio.customers.models.dto.CustomerDTOperfil;
import com.planealo.negocio.customers.models.dto.CustomerDTOresumen;
import com.planealo.negocio.customers.models.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-20T17:14:41+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer perfilToCustomer(CustomerDTOperfil usuarioDTO) {
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

    @Override
    public CustomerDTOperfil toDTOperfil(Customer usuario) {
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

        CustomerDTOperfil customerDTOperfil = new CustomerDTOperfil( ref, nombre, email, pass );

        return customerDTOperfil;
    }

    @Override
    public Customer resumenToCustomer(CustomerDTOresumen usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.referencia( usuarioDTO.ref() );
        customer.nombre( usuarioDTO.nombre() );

        return customer.build();
    }

    @Override
    public CustomerDTOresumen toDTOresumen(Customer usuario) {
        if ( usuario == null ) {
            return null;
        }

        String ref = null;
        String nombre = null;

        ref = usuario.getReferencia();
        nombre = usuario.getNombre();

        CustomerDTOresumen customerDTOresumen = new CustomerDTOresumen( ref, nombre );

        return customerDTOresumen;
    }

    @Override
    public Customer loginToCustomer(CustomerDTOlogin usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.password( usuarioDTO.pass() );

        return customer.build();
    }

    @Override
    public CustomerDTOlogin toDTOlogin(Customer usuario) {
        if ( usuario == null ) {
            return null;
        }

        String email = null;

        email = usuario.getEmail();

        String pass = null;

        CustomerDTOlogin customerDTOlogin = new CustomerDTOlogin( email, pass );

        return customerDTOlogin;
    }
}
