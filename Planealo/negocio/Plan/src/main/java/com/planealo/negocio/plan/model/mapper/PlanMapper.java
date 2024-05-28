package com.planealo.negocio.plan.model.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.planealo.negocio.plan.model.dto.MemberDTO;
import com.planealo.negocio.plan.model.dto.PlanDTO;
import com.planealo.negocio.plan.model.dto.PlanDTOresumen;
import com.planealo.negocio.plan.model.entity.Plan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlanMapper {
	
	@Mapping(target= "id", ignore = true)
	@Mapping(target= "miembros", ignore = true)
	Plan DTOtoPlan(PlanDTO plan);
	
	@InheritInverseConfiguration
	@Mapping(target="miembros", source="members")
	PlanDTO ToDto(Plan plan, List<MemberDTO> members);
	
	
	
	// ###### DTOresumen ##########################
	@Mapping(target= "id", ignore = true)
	@Mapping(target= "miembros", ignore = true)
	@Mapping(target= "fechaFin", ignore = true)
	@Mapping(target= "fechaCreacion", ignore = true)
	@Mapping(target= "modo", ignore = true)
	Plan ResumentoPlan(PlanDTOresumen planResumen);
	
	@InheritInverseConfiguration
	PlanDTOresumen toDTOresumen(Plan plan);
	
	List<PlanDTOresumen> toDTOresumenList(List<Plan> planes);
	
	
}
