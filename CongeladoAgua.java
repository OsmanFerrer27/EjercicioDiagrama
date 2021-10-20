package com.ejercicio.package1;

public class CongeladoAgua extends ProductoFrio {

	private String salinidad;
	
	public CongeladoAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisDeOrigen);
	}

    public void calcularSalinidad() {
	
    }

	public String getSalinidad() {
		return salinidad;
	}
    
}
