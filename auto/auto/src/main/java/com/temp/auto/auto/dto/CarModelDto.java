package com.temp.auto.auto.dto;

import java.time.LocalDateTime;

import com.temp.auto.auto.constant.CarStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class CarModelDto {
	
	private Long carId;
	private String carBrand;
	private String licensePlate;
	private String carManufacturer;
	private String operationCity;
	private CarStatus carStatus;
	private LocalDateTime CreatedAt;
	private LocalDateTime LastUpdatedAt;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getCarManufacturer() {
		return carManufacturer;
	}
	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}
	public String getOperationCity() {
		return operationCity;
	}
	public void setOperationCity(String operationCity) {
		this.operationCity = operationCity;
	}
	public CarStatus getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}
	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	public LocalDateTime getLastUpdatedAt() {
		return LastUpdatedAt;
	}
	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		LastUpdatedAt = lastUpdatedAt;
	}

	
	
	
}
