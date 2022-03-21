package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Revista implements ProductoPrestable {

	private LocalDate fechaPublicacion;
	private String nombre;
	private int numero; // Clave primaria
	private String periocidad;
	private boolean prestado;
	private static int cantidadUnidades; // Para saber cuántas unidades hay
	
	
	public Revista(LocalDate fechaPublicacion, String nombre, int numero, String periocidad) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
		this.numero = numero;
		this.periocidad = periocidad;
		cantidadUnidades++;
	}
	
	@Override
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", periocidad=");
		builder.append(periocidad);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void prestar() throws ExceptionPrestado {
		if(!this.isPrestado()) {
			this.prestado = true;
		}else {
			throw new ExceptionPrestado("La revista está prestado.");
		}
	}


	@Override
	public void devolver() throws ExceptionPrestado {
		if(this.isPrestado()) {
			this.prestado = false;
		}else {
			throw new ExceptionPrestado("La revista no está prestado.");
		}
	}


	public static int getCantidadUnidades() {
		return cantidadUnidades;
	}
	
}
