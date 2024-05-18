package com.planealo.negocio.plan.model.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planes")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "referencia_propietario", nullable = false)
    private Integer referenciaPropietario;

    @CreationTimestamp
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "ubicacion_latitud")
    private Double ubicacionLatitud;

    @Column(name = "ubicacion_longitud")
    private Double ubicacionLongitud;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "modo", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private Modo modo;

    @Column(name = "ciudad", length = 255)
    private String ciudad;

    public enum Modo {
        PRIVADA,
        PUBLICA
    }
}
