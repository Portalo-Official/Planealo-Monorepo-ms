package com.planealo.negocio.plan.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.entity.PlanMember.PlanMiembroId;
import com.planealo.negocio.plan.model.entity.Rol;
import com.planealo.negocio.plan.model.entity.Rol.RolNombre;
import com.planealo.negocio.plan.repository.PlanMemberRepository;

@SpringBootTest
@ActiveProfiles("test")
@Sql("/sql/data-planesmiembro.sql")
class PlanMemberServiceImplTest {

	@Autowired
	private PlanMemberServiceImpl planMemberService;

	@Autowired
	private PlanMemberRepository planMemberRepository;
	
	@BeforeEach // En cada test correra el script data.sql
    void setUp() {
        planMemberRepository.deleteAll();
    }

	@Test
	void testAdd() {
		String planRef= "5c2064da-bf6c"; // Ya existe en la ddbb
		String userRef= "V12223C-91"; // Nuevo
		
		PlanMember planMember = PlanMember.builder()
										  .id(new PlanMiembroId(planRef, userRef))
										  .build();
	}
//	
//
//	    @Test
//	    public void testGetByRef() {
//	        PlanMember planMember = planMemberService.getByRef("MT5A4E81-6C");
//	        assertNotNull(planMember);
//	        assertEquals("MT5A4E81-6C", planMember.getUsuarioRef());
//	    }
//
//	    @Test
//	    public void testGetAll() {
//	        List<PlanMember> planMembers = planMemberService.getAll();
//	        assertNotNull(planMembers);
//	        assertFalse(planMembers.isEmpty());
//	    }
//
//	    @Test
//	    public void testUpdate() {
//	        PlanMember planMember = planMemberService.getByRef("MT5A4E81-6C");
//	        planMember.setRol(new Rol(2L, RolNombre.INVITADO));
//
//	        PlanMember updatedPlanMember = planMemberService.update("MT5A4E81-6C", planMember);
//
//	        assertNotNull(updatedPlanMember);
//	        assertEquals(RolNombre.INVITADO, updatedPlanMember.getRol().getNombre());
//	    }
//
//	    @Test
//	    public void testDelete() {
//	        boolean deleted = planMemberService.delete("MT5A4E81-6C");
//	        assertTrue(deleted);
//	        assertNull(planMemberService.getByRef("MT5A4E81-6C"));
//	    }
//
//	    @Test
//	    public void testGetByIdUsuarioRef() {
//	        List<PlanMember> planMembers = planMemberService.getByIdUsuarioRef("MT5A4E81-6C");
//	        assertNotNull(planMembers);
//	        assertFalse(planMembers.isEmpty());
//	        assertEquals("MT5A4E81-6C", planMembers.get(0).getId().getUsuarioRef());
//	    }

}
