package com.temp.auto.auto.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.temp.auto.auto.constant.CarStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car_details")
@Setter
@Getter
public class CarModelEntity {

	@Id
	@Column(name = "car_id")
	private Long carId;
	@Column(name = "car_brand")
	private String carBrand;
	@Column(name = "license_plate")
	private String licensePlate;
	@Column(name = "car_manufacturer")
	private String carManufacturer;
	@Column(name = "operation_city")
	private String operationCity;
	@Column(name = "car_status")
	@Enumerated(EnumType.STRING)
	private CarStatus carStatus;
	@Column(name = "Created_at")
	private LocalDateTime CreatedAt;
	@Column(name = "last_updated_at")
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
