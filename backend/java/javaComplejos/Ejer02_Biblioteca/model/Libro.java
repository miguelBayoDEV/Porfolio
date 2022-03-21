package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Libro implements ProductoPrestable {

	private LocalDate fechaPublicacion;
	private String nombre;
	private String edicion;
	private String isbn;
	private String autor; // Si es único sería la clave para la búsqueda
	private boolean prestado; // Al crearlo por defecto siempre es falso
	private static int cantidadUnidades; // Para saber cuántas unidades hay
	
	
	public Libro(LocalDate fechaPublicacion, String nombre, String edicion, String isbn, String autor) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
		this.edicion = edicion;
		this.isbn = isbn;
		this.autor = autor;
		cantidadUnidades++;
	}
	
	@Override
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edicion=");
		builder.append(edicion);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void prestar() throws ExceptionPrestado {
		if(!this.isPrestado()) {
			this.prestado = true;
		}else {
			throw new ExceptionPrestado("El libro está prestado.");
		}
	}


	@Override
	public void devolver() throws ExceptionPrestado {
		if(this.isPrestado()) {
			this.prestado = false;
		}else {
			throw new ExceptionPrestado("El libro no está prestado.");
		}
	}


	public static int getCantidadUnidades() {
		return cantidadUnidades;
	}
	
}
