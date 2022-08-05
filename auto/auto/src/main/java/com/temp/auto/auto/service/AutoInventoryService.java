package com.temp.auto.auto.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.temp.auto.auto.constant.CarModelRepository;
import com.temp.auto.auto.dto.AutoResponse;
import com.temp.auto.auto.dto.CarModelDto;
import com.temp.auto.auto.dto.CarModelEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
//@AllArgsConstructor
public class AutoInventoryService {

	private CarModelRepository carModelRepository;
	
	
	@Autowired
	public AutoInventoryService(CarModelRepository carModelRepository) {
		this.carModelRepository = carModelRepository;
	}


	//private CarModelMapper mapper = Mappers.getMapper(CarModelMapper.class);
	
	
	

	public AutoResponse processAutoInventory(CarModelDto carModelDto) {
		AutoResponse response = new AutoResponse();

		try {
			List<CarModelEntity> cardetail = carModelRepository.findByCarId(carModelDto.getCarId());
			if (cardetail.isEmpty()) {
				//CarModelEntity carModelEntity = mapper.voToEntity(carModelDto);
				CarModelEntity carModelEntity = voToEntity(carModelDto);

				carModelEntity.setCreatedAt(LocalDateTime.now());
				carModelEntity.setLastUpdatedAt(LocalDateTime.now());

				CarModelEntity entity = carModelRepository.save(carModelEntity);

				//response = mapper.entityToresp(entity);
				response = entityToresp(entity);
				response.setResponse("Car model details sucessfull entered...");
			} else {
				//response = mapper.entityToresp(cardetail.get());
				response = entityToresp(cardetail.get(0));
				response.setResponse("Car model existing...");
			}
		} catch (RuntimeException ex) {
			response.setResponse("Technical error occured");
		}

		return response;

	}
	
	private AutoResponse entityToresp(CarModelEntity entity) {
		AutoResponse resp = new AutoResponse();
		resp.setCarId(entity.getCarId());
		resp.setCarBrand(entity.getCarBrand());
		resp.setCarManufacturer(entity.getCarManufacturer());
		resp.setCarStatus(entity.getCarStatus());
		resp.setLicensePlate(entity.getLicensePlate());
		resp.setOperationCity(entity.getOperationCity());
		resp.setCreatedAt(entity.getCreatedAt());
		resp.setLastUpdatedAt(entity.getLastUpdatedAt());
		return resp;
	}

	private CarModelEntity voToEntity(CarModelDto carModelDto) {
		CarModelEntity entity = new CarModelEntity();
		entity.setCarId(carModelDto.getCarId());
		entity.setCarBrand(carModelDto.getCarBrand());
		entity.setCarManufacturer(carModelDto.getCarManufacturer());
		entity.setCarStatus(carModelDto.getCarStatus());
		entity.setLicensePlate(carModelDto.getLicensePlate());
		entity.setOperationCity(carModelDto.getOperationCity());
		entity.setCreatedAt(carModelDto.getCreatedAt());
		entity.setLastUpdatedAt(carModelDto.getLastUpdatedAt());
		return entity;
	}

	public AutoResponse inquireAutoInventory(Long carId) {
		
		AutoResponse response = new AutoResponse();

		List<CarModelEntity> cardetail = carModelRepository.findByCarId(carId);
		if (!cardetail.isEmpty()) {
			//response = mapper.entityToresp(cardetail.get());
			response = entityToresp(cardetail.get(0));
			response.setResponse("Car model details fetched successfully...");
		}else {
			response.setResponse("No car model details matching citeria...");
		}
		
		return response;
	}

	

}
