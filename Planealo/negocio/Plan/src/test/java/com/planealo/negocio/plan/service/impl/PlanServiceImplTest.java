package com.planealo.negocio.plan.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.repository.PlanRepository;

@SpringBootTest
@ActiveProfiles("test")
//@Sql(scripts = {"/sql/clean-registros.sql"}, executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
@Sql(scripts = {"/sql/data-planes.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
class PlanServiceImplTest {
	
	final String REFERENCIA_EXISTENTE = "5c2064da-bf6c";
	
	@Autowired
	private PlanServiceImpl planService;

	@Autowired
	private PlanRepository planRepository;

	@AfterEach // En cada test correra el script data.sql
	void setUp() {
		planRepository.deleteAll();
//		System.err.println("# Borrando Datos");
//		System.err.println("[Prueba]  "+planRepository.findByReferencia("5c2064da-bf6c"));
	}

	@Test
	@Order(0)
	void testAdd() {
		String descripcion = "Feria de FP en Salon del Vino";

		Plan plan = new Plan();
		plan.setDescripcion(descripcion);
		plan.setModo(Plan.Modo.PUBLICA);

		Plan planGuardado = this.planService.add(plan);

		// Asegurar no nulos - se generan solos
		assertNotNull(planGuardado);
		assertNotNull(planGuardado.getId());
		assertNotNull(planGuardado.getReferencia());
		assertNotNull(planGuardado.getFechaCreacion());

		assertEquals(LocalDate.now(), planGuardado.getFechaCreacion().toLocalDate());
//		System.err.println("ADD [FIN]");
	}

	@Test
    void testDelete() {
        Plan plan = this.planService.getByRef(REFERENCIA_EXISTENTE);
        assertNotNull(plan, "El plan no tiene que ser null");

        this.planService.delete(REFERENCIA_EXISTENTE);
        Plan deletedPlan = this.planService.getByRef(REFERENCIA_EXISTENTE);
        assertNull(deletedPlan, "El plan tiene que ser null después de ser eliminado");
    }

	@Test
	void testGetByRef() {
		
		Plan plan = this.planService.getByRef(REFERENCIA_EXISTENTE);
		assertNotNull(plan, "Se esperaba un valor NO nulo");
		assertEquals(REFERENCIA_EXISTENTE, plan.getReferencia(), "La referencia no coincide");
		
		List<Plan> planes = this.planService.getAll();
		List<Plan> planesByRef = new ArrayList<>();
		
		planes.forEach(p ->{
			Plan planByRef = this.planService.findByReferencia(p.getReferencia());
			if(planByRef!=null) {
				planesByRef.add(planByRef);
			}
		});
		assertEquals(planes.size(), planesByRef.size(), "Se espaban los mismo elementos en las listas");
		
	}


    @Test
    void testGetAll() {
        List<Plan> planes = this.planService.getAll();
        assertNotNull(planes, "La lista de planes no tiene que ser null");
        assertFalse(planes.isEmpty(), "La lista de planes no debería estar vacía");
    }

    @Test
    void testUpdate() {
        Plan plan = this.planService.getByRef(REFERENCIA_EXISTENTE);
        assertNotNull(plan, "El plan no debería ser null");

        String nuevaDescripcion = "Nueva descripción de prueba";
        plan.setDescripcion(nuevaDescripcion);
        Plan planActualizado = this.planService.update(plan);

        assertNotNull(planActualizado, "El plan actualizado no debería ser null");
        assertEquals(nuevaDescripcion, planActualizado.getDescripcion(), "La descripción del plan no se actualizó correctamente");
    }

    @Test
    void testFindByReferencia() {
        
        Plan plan = this.planService.findByReferencia(REFERENCIA_EXISTENTE);
        assertNotNull(plan, "El plan no debería ser null");
        assertEquals(REFERENCIA_EXISTENTE, plan.getReferencia(), "La referencia del plan no coincide");
    }

    @Test
    void testFindByReferenciaNotFound() { 
    	String referenciaNoValida = "Elena-Zambrano-Callate";
    	Plan plan = this.planService.findByReferencia(referenciaNoValida);
        assertNull(plan, "El plan debería ser null para una referencia inexistente");
    }

}
