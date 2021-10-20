package com.ejercicio.package1;

public class CongeladoAire extends ProductoFrio {

	private String nitrogeno;
	private String oxigeno;
	private String dioxCarbono;
	private String vaporAgua;
	private String composicion;
	
	
	public CongeladoAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen, String nitrogeno, String oxigeno, String dioxCarbono, String vaporAgua) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisDeOrigen);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxCarbono = dioxCarbono;
		this.vaporAgua = vaporAgua;
		
	}

	public void Composicion() {}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

}

