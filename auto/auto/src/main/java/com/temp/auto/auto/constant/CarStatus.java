package com.temp.auto.auto.constant;

import java.util.stream.Stream;

public enum CarStatus {
	
	BLANK(""),AVAILABLE("available"),IN_MAINT("in-maintenance"), OUT_OF_SERVICE("out-of-service");
	
	private final String status;
	

	private CarStatus(String status) {
		this.status = status;
	}


	public String getStatus() {
		return status;
	}


	public static CarStatus of(String status) {
        return Stream.of(CarStatus.values())
          .filter(p -> p.getStatus().equalsIgnoreCase(status))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }
	

}
