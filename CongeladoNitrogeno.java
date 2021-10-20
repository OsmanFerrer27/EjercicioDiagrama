package com.ejercicio.package1;

public class CongeladoNitrogeno extends ProductoFrio {

	private String metodoEmpleado;
	private String tiempoExposicion;
	
	public CongeladoNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisDeOrigen, String metodoEmpleado, String tiempoExposicion) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisDeOrigen);
		this.metodoEmpleado = metodoEmpleado;
		this.tiempoExposicion = tiempoExposicion;
	}

	public String getMetodoEmpleado() {
		return metodoEmpleado;
	}

	public void setMetodoEmpleado(String metodoEmpleado) {
		this.metodoEmpleado = metodoEmpleado;
	}

	public String getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(String tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

}
