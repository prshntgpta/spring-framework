package org.prshntgpta.core;

public class Car {

	private String model;
	private Boolean isAutomatic;
	private TransmissionService transmissionService;
	
	
	public Car(TransmissionService tService) {
		this.transmissionService = tService;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getIsAutomatic() {
		isAutomatic =  transmissionService.isAutomatic();
		return isAutomatic;
	}



}
