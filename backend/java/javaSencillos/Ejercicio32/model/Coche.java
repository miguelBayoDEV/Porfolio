package model;

import lombok.Data;

@Data
public class Coche {

	private String modelo;
	private String matricula;
	private double longitud;
	private double anchura;
	
	
	public Coche(String modelo, String matricula, double longitud, double anchura) {
		super();
		this.modelo = modelo;
		this.matricula = matricula;
		this.longitud = longitud;
		this.anchura = anchura;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [modelo=");
		builder.append(modelo);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", anchura=");
		builder.append(anchura);
		builder.append("]");
		return builder.toString();
	}
	
}
