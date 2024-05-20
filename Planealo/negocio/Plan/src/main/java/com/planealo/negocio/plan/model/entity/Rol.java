package com.planealo.negocio.plan.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RolNombre nombre;

	// TODO iria mejor fuera? 
	public enum RolNombre {
		ADMINISTRADOR(true),
		INVITADO(false),
		PROPIETARIO(true);

		private final boolean canDelete;

		RolNombre(boolean canDelete) {
			this.canDelete = canDelete;
		}

		public boolean canDeleteMember() {
			return this.canDelete;
		}
	}
}
