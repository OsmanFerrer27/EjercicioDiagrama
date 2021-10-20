package com.ejercicio.package1;

public class ProductoSC {

	private String fechaCaducidad;
	private int numeroLote;
	private String fechaEnvasado;
	private String paisDeOrigen;
	
	
    public ProductoSC(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen) {
	  this.fechaCaducidad = fechaCaducidad;
	  this.numeroLote = numeroLote;
	  this.fechaEnvasado = fechaEnvasado;
	  this.paisDeOrigen = paisDeOrigen;
}


public String getFechaCaducidad() {
	return fechaCaducidad;
}


public void setFechaCaducidad(String fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}


public int getNumeroLote() {
	return numeroLote;
}


public void setNumeroLote(int numeroLote) {
	this.numeroLote = numeroLote;
}


public String getFechaEnvasado() {
	return fechaEnvasado;
}


public void setFechaEnvasado(String fechaEnvasado) {
	this.fechaEnvasado = fechaEnvasado;
}


public String getPaisDeOrigen() {
	return paisDeOrigen;
}


public void setPaisDeOrigen(String paisDeOrigen) {
	this.paisDeOrigen = paisDeOrigen;
}


}

