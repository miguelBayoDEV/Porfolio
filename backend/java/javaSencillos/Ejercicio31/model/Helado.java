package model;

import java.util.Arrays;

import lombok.Data;

@Data
public class Helado {
	
	private String nombre;
	private CopaHelado copaHelado;
	private SaborHelado[] sabores;
	private RecipienteHelado recipiente;
	private double precioFinal;
	
	
	public Helado(String nombre, CopaHelado copaHelado, SaborHelado[] sabores, RecipienteHelado recipiente) {
		super();
		this.nombre = nombre;
		this.copaHelado = copaHelado;
		this.sabores = sabores;
		this.recipiente = recipiente;
		this.precioFinal = this.getCopaHelado().getPrecio() + this.getRecipiente().getPrecio();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Heladeria [nombre=");
		builder.append(nombre);
		builder.append(", copaHelado=");
		builder.append(copaHelado);
		builder.append(", número de bolas=");
		builder.append(copaHelado.getBolas());
		builder.append(", sabores=");
		builder.append(Arrays.toString(sabores));
		builder.append(", recipiente=");
		builder.append(recipiente);
		builder.append(", precioFinal=");
		builder.append(precioFinal);
		builder.append(" euros]");
		return builder.toString();
	}
	
}
