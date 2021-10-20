package com.ejercicio.package1;

public class ProductoRefrigerado extends ProductoFrio {

	private String codSupervision;
	
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisDeOrigen);
	}

	public String getCodSupervision() {
		return codSupervision;
	}

	public void setCodSupervision(String codSupervision) {
		this.codSupervision = codSupervision;
	}

	
}

