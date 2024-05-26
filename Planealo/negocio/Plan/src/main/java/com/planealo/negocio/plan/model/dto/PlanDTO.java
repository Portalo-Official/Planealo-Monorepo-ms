package com.planealo.negocio.plan.model.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PlanDTO(String referencia,
					LocalDateTime fechaCreacion,
					LocalDateTime fechaFin,
					Double ubicacionLatitud,
					Double ubicacionAltitud,
					String descripcion,
					String modo,
					List<CustomerDTOresumen> usuarios) {

}
