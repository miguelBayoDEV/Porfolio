package model;

import lombok.Data;

@Data
public class Meses {
	
	private Mes mes;
	
	
	public Meses(Mes mes) {
		super();
		this.mes = mes;
	}

	public static boolean isBisiesto(int year) {
		boolean resultado = false;
		resultado = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? true : false ;
		return resultado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meses [mes=");
		builder.append(mes);
		builder.append(", número de días=");
		builder.append(mes.getDias());
		builder.append("]");
		return builder.toString();
	}

	
}
