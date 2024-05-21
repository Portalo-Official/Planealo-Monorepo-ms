package com.planealo.negocio.plan.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "plan_miembros")
public class PlanMember {
	
	@EmbeddedId
	private PlanMiembroId id;
	
	// Para claves primarias embebidas 
	// https://stackoverflow.com/questions/9923643/can-someone-please-explain-me-mapsid-in-hibernate
	@MapsId("planId") // Elemto de la clave compuesta PlanMiembroId
	@ManyToOne
	@JoinColumn(name = "plan_id")
	private Plan plan;

	@Column(name = "usuario_ref", length = 150, nullable = false, insertable = false, updatable = false)
	private String usuarioRef;


	@ManyToOne
	@JoinColumn(name = "rol_id") 
	private Rol rol;
	
	@Embeddable // @@Embeddable -> https://www.baeldung.com/jpa-composite-primary-keys
	@Data
	@AllArgsConstructor
	public class PlanMiembroId implements Serializable {
	    private Long planId;
	    private String usuarioRef;
	}
}
