package model;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Disco extends Multimedia {

	private String titulo;
	private LocalTime duracion;
	private Formato formato;
	private static int cantidadUnidades; // Para saber cuántas unidades hay
	
	public Disco(int codigo, LocalDate fechaPublicacion, String titulo, LocalTime duracion, Formato formato) {
		super(codigo, fechaPublicacion);
		this.titulo = titulo;
		this.duracion = duracion;
		this.formato = formato;
		cantidadUnidades++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [codigo=");
		builder.append(this.getCodigo());
		builder.append(", fecha de publicación=");
		builder.append(this.getFechaPublicacion());
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", formato=");
		builder.append(formato);
		builder.append("]");
		return builder.toString();
	}

	public static int getCantidadUnidades() {
		return cantidadUnidades;
	}
	
}
