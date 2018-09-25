package org.prshntgpta.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String model;
	private Boolean isAutomatic;
	
	//@Autowired
	private TransmissionService transmissionService;

//	public Car(TransmissionService tService) {
//		this.transmissionService = tService;
//	}

	public String getModel() {
		return model;
	}

	public TransmissionService getTransmissionService() {
		return transmissionService;
	}

	
	@Required
	public void setTransmissionService(TransmissionService transmissionService) {
		this.transmissionService = transmissionService;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getIsAutomatic() {
		isAutomatic = transmissionService.isAutomatic();
		return isAutomatic;
	}

}
