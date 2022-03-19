package model;

import lombok.Data;

@Data
public class Asignatura {

	private String nombre;
	private int codigoNumerico;
	private Curso curso;
	
	
	public Asignatura(String nombre, int codigoNumerico, Curso curso) {
		this.nombre = nombre;
		this.codigoNumerico = codigoNumerico;
		this.curso = curso;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asignatura [nombre=");
		builder.append(nombre);
		builder.append(", codigoNumerico=");
		builder.append(codigoNumerico);
		builder.append(", curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}
}
