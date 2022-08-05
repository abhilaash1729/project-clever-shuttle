package com.temp.auto.auto.constant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temp.auto.auto.dto.CarModelEntity;

public interface CarModelRepository extends JpaRepository<CarModelEntity, Long> {

	List<CarModelEntity> findByCarId(Long carId);

}
