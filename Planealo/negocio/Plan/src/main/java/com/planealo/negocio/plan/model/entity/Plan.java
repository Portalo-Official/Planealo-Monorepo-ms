package com.planealo.negocio.plan.model.entity;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "planes")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column( unique = true, nullable = false, updatable = false, length = 150)
    private String referencia;
    
    @CreationTimestamp
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "ubicacion_latitud")
    private Double ubicacionLatitud;

    @Column(name = "ubicacion_longitud")
    private Double ubicacionLongitud;

    @Column( columnDefinition = "TEXT")
    private String descripcion;

    @Column( nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private Modo modo;

//    @Column(name = "ciudad", length = 255)
//    private String ciudad;

    /* Lo he visto en practicas y por internet pero no se si me gusta aqui
     * Lo dejo porque considero que el enum tiene la sohesion necesario para 
     * depender solamente de Plan
     */
    public enum Modo {
        PRIVADA,
        PUBLICA;
    	
    }
    
    //@JoinColumn(name ="plan_id") 
    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlanMember> miembros;
    
    @PrePersist
    protected void prePersist() {
        this.referencia = UUID.randomUUID().toString();
       
    }
    
}
