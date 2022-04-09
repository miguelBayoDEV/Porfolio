package model;

import lombok.Data;

@Data
public class Lavado {
	
	private Coche coche;
	private TipoLavado tipo;
	
	
	public Lavado(Coche coche, TipoLavado tipo) {
		super();
		this.coche = coche;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TunelLavado [coche=");
		builder.append(coche.toString());
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", tiempo=");
		builder.append(tipo.getTiempo());
		builder.append(", precio=");
		builder.append(tipo.getPrecio());
		builder.append(" euros]");
		return builder.toString();
	}
	
}
