package com.planealo.negocio.plan.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.planealo.negocio.plan.model.entity.Plan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlanDTOaux {

	private String referencia;
	private String titulo;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaFin;
	private Double ubicacionLatitud;
	private Double ubicacionAltitud;
	private String descripcion;
	private String modo;
	private List<CustomerDTOresumen> usuarios;
	
	
	public static PlanDTOaux toDTO(Plan plan, List<CustomerDTOresumen> customers) {
		return new PlanDTOaux(plan.getReferencia(),
						  plan.getTitulo(),
						  plan.getFechaCreacion(),
						  plan.getFechaFin(),
						  plan.getUbicacionLatitud(),
						  plan.getUbicacionAltitud(),
						  plan.getDescripcion(),
						  plan.getModo().toString(),
						  customers);
	}
	
//	public static Plan toPlan(Plan plan, List<CustomerDTOresumen> customers) {
//		return new PlanDTOaux(plan.getReferencia(),
//				plan.getTitulo(),
//				plan.getFechaCreacion(),
//				plan.getFechaFin(),
//				plan.getUbicacionLatitud(),
//				plan.getUbicacionAltitud(),
//				plan.getDescripcion(),
//				plan.getModo().toString(),
//				customers);
//	}
}
