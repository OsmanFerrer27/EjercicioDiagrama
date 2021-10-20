package com.ejercicio.package1;

public class ProductoRefrigerado extends ProductoFrio {

	private String codSupervision;
	
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen, String codSupervision) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisDeOrigen);
		this.codSupervision = codSupervision;
	}

	public String getCodSupervision() {
		return codSupervision;
	}

	public void setCodSupervision(String codSupervision) {
		this.codSupervision = codSupervision;
	}

	
}

