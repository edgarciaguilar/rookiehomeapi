package dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.mapper;

import org.mapstruct.Mapper;

import dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.dto.RealEstateProperty;
import dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.entity.RealEstatePropertyEntity;

@Mapper(componentModel = "spring")
public interface RealEstatePropertyMapper {
	
	RealEstatePropertyEntity toEntity(RealEstateProperty model);
	RealEstateProperty toModel(RealEstatePropertyEntity entity);

}
