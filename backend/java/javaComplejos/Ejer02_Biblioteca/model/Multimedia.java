package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Multimedia implements ProductoPrestable {

	private int codigo; // Clave primaria
	private boolean prestado;
	private LocalDate fechaPublicacion;

	public Multimedia(int codigo, LocalDate fechaPublicacion) {
		super();
		this.codigo = codigo;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	@Override
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", fecha de publicación=");
		builder.append(fechaPublicacion);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void prestar() throws ExceptionPrestado {
		if(!this.isPrestado()) {
			this.prestado = true;
		}else {
			throw new ExceptionPrestado("Está prestado.");
		}
	}


	@Override
	public void devolver() throws ExceptionPrestado {
		if(this.isPrestado()) {
			this.prestado = false;
		}else {
			throw new ExceptionPrestado("No está prestado.");
		}
	}
	
}
