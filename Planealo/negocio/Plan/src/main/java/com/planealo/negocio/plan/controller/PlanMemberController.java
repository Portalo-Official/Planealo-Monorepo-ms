package com.planealo.negocio.plan.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.plan.model.dto.MemberDTO;
import com.planealo.negocio.plan.model.dto.PlanDTO;
import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.entity.PlanMember.PlanMiembroId;
import com.planealo.negocio.plan.model.entity.Rol;
import com.planealo.negocio.plan.service.impl.PlanMemberServiceImpl;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/miembros")
public class PlanMemberController {

	private final PlanMemberServiceImpl planMemberService;

	public PlanMemberController(PlanMemberServiceImpl planMemberService) {
		super();
		this.planMemberService = planMemberService;
	}

	@GetMapping("all")
	public ResponseEntity<List<?>> findAll() {

		return ResponseEntity.ok(this.planMemberService.getAll());
	}

	@GetMapping("/{referencia}")
	public ResponseEntity<?> findByUsuarioReferencia(@PathVariable String referencia) {

		List<PlanMember> planMember = this.planMemberService.getByUsuarioRef(referencia);
		return ResponseEntity.ok(planMember);
	}

	@GetMapping("plan/{referencia}")
	public ResponseEntity<?> findByPlansReferencia(@PathVariable String referencia) {

		List<PlanMember> planMember = this.planMemberService.getByPlanRef(referencia);
		return ResponseEntity.ok(planMember);
	}

	@DeleteMapping("/delete/{referenciaPlan}")
	public ResponseEntity<?> deleteAllByPlan(@PathVariable String referenciaPlan) {
		Boolean isDelete = this.planMemberService.deleteAllByPlan(referenciaPlan);
		if (isDelete) {
			return ResponseEntity.ok(referenciaPlan);
		} else {
			return ResponseEntity.badRequest().header("Delete miembros", HttpHeaders.WARNING)
					.body("Problemas al borrar los usuarios");
		}
	}

	@DeleteMapping("/delete-all-users/{referenciaPlan}")
	public ResponseEntity<?> deleteAllByUser(@PathVariable String referencia) {
		Boolean isDelete = this.planMemberService.deleteAllByPlan(referencia);
		if (isDelete) {
			return ResponseEntity.ok(referencia);
		} else {
			return ResponseEntity.badRequest().header("Delete miembros", HttpHeaders.WARNING)
					.body("Problemas al borrar los usuarios");
		}
	}

	@PostMapping("new/{referenciaPlan}")
	public ResponseEntity<?> createPlan(@PathVariable String referenciaPlan,
										@RequestBody PlanMember miembroDTO) {
		

		PlanMember miembro = new PlanMember( miembroDTO.getId(),
											miembroDTO.getRol());
		miembro.getId().setPlanReferencia(referenciaPlan);
		miembro = this.planMemberService.add(miembro);
		
		if (miembro != null) {

			return ResponseEntity.ok(miembro);
		}
		return ResponseEntity.badRequest().body("Problemas al crear el plan");
	}

	@DeleteMapping("")
	public ResponseEntity<?> deleteMiembro(@RequestBody PlanMember.PlanMiembroId miembro) {
		Boolean isDelete = this.planMemberService.delete(miembro);
		if (isDelete) {
			return ResponseEntity.ok(miembro);
		} else {
			return ResponseEntity.badRequest().header("Delete miembros", HttpHeaders.WARNING)
					.body("Problemas al borrar los usuarios");
		}
	}

}
