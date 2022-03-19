package model;

import lombok.Data;

@Data
public class Carrera {

	private String nombre;
	private int codigo;
	
	
	public Carrera(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carrera [nombre=");
		builder.append(nombre);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append("]");
		return builder.toString();
	}
}
