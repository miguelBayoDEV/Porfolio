package model;

import lombok.Data;

@Data
public class Curso {

	private String tipoCurso;
	private Carrera carrera;
	
	
	public Curso(String tipoCurso, Carrera carrera) {
		this.tipoCurso = tipoCurso;
		this.carrera = carrera;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [tipoCurso=");
		builder.append(tipoCurso);
		builder.append(", carrera=");
		builder.append(carrera);
		builder.append("]");
		return builder.toString();
	}
}
