package com.planealo.negocio.plan.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.planealo.negocio.plan.model.dto.CustomerDTOresumen;
import com.planealo.negocio.plan.model.dto.MemberDTO;
import com.planealo.negocio.plan.model.entity.PlanMember;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlanMemberMapper {

	  	@Mapping(target = "ref", source = "planMember.id.usuarioRef")
	    @Mapping(target = "nombre", source = "customerDTOresumen.nombre")
	    @Mapping(target = "rol", source = "planMember.rol.nombre")
	    MemberDTO toMemberDTO(PlanMember planMember, CustomerDTOresumen customerDTOresumen);
	  	
	
}
