package com.temp.auto.auto.mapper;

import org.mapstruct.Mapper;

import com.temp.auto.auto.dto.AutoResponse;
import com.temp.auto.auto.dto.CarModelDto;
import com.temp.auto.auto.dto.CarModelEntity;

@Mapper(componentModel="spring") 
public interface CarModelMapper {
	
	CarModelDto entityToVo(CarModelEntity entity);
	CarModelEntity voToEntity(CarModelDto dto);
	AutoResponse entityToresp(CarModelEntity entity);
}
