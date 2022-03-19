package Coche_Ejer02;

import lombok.Data;

@Data
public class Coche {

	private String modelo;
	private String color;
	private boolean metalizada;
	private String matricula;
	private TipoCoche tipoCoche;
	private int yearFabricacion;
	private ModalidadSeguro modalidadSeguro;
	
	
	public Coche(String modelo, String color, boolean metalizada, String matricula, TipoCoche tipoCoche,
			int yearFabricacion, ModalidadSeguro modalidadSeguro) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.metalizada = metalizada;
		this.matricula = matricula;
		this.tipoCoche = tipoCoche;
		this.yearFabricacion = yearFabricacion;
		this.modalidadSeguro = modalidadSeguro;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", metalizada=");
		builder.append(metalizada);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", tipoCoche=");
		builder.append(tipoCoche);
		builder.append(", yearFabricacion=");
		builder.append(yearFabricacion);
		builder.append(", modalidadSeguro=");
		builder.append(modalidadSeguro);
		builder.append("]");
		return builder.toString();
	}
}
