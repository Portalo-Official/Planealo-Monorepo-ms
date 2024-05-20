package com.planealo.negocio.customers.models.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "usuarios")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private Long id;

	@Column(name = "nombre", nullable = false, length = 255 )
	private String nombre;
	
	@Column(name = "ref", unique = true, nullable = false, length = 255)
	private String referencia;
	
	@Column(name = "email", unique = true )
	private String email;
	
	@Column(name = "contrasena", nullable = false, length = 255)
	private String password;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;

	@Column(name = "fecha_ultima_actualizacion")
	private LocalDateTime fechaUltimaActualizacion;
	
	@Column(name = "ultimo_inicio_sesion")
	private LocalDateTime ultimoInicioSesion;
	
	
	public Customer(String nombre, String referencia, String email, String password) {
		super();
		this.nombre = nombre;
		this.referencia = referencia;
		this.email = email;
		this.password = password;
	}
}
