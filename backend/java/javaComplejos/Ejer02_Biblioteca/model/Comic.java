package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Comic implements ProductoPrestable {

	private LocalDate fechaPublicacion;
	private String nombre;
	private int numero; // Clave primaria
	private String coleccion;
	private boolean prestado;
	private static int cantidadUnidades; // Para saber cuántas unidades hay
	
	@Override
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	
	public Comic(LocalDate fechaPublicacion, String nombre, int numero, String coleccion) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
		this.numero = numero;
		this.coleccion = coleccion;
		cantidadUnidades++;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comic [fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", coleccion=");
		builder.append(coleccion);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void prestar() throws ExceptionPrestado {
		if(!this.isPrestado()) {
			this.prestado = true;
		}else {
			throw new ExceptionPrestado("El comic está prestado.");
		}
	}


	@Override
	public void devolver() throws ExceptionPrestado {
		if(this.isPrestado()) {
			this.prestado = false;
		}else {
			throw new ExceptionPrestado("El comic no está prestado.");
		}
	}


	public static int getCantidadUnidades() {
		return cantidadUnidades;
	}
	
}
