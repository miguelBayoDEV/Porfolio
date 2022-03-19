package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Director extends Empleado {

	private boolean incentivoDirector;
	private String matriculaCoche;

	
	public Director(String nombre, double salario, LocalDate fechaNacimiento, String dni, String matriculaCoche) {
		super(nombre, salario, fechaNacimiento, dni);
		this.incentivoDirector = true;
		this.matriculaCoche = matriculaCoche;
	}
	
	public void incentivoGerente() {
		setSalario((this.getSalario() * 1.10) + 100);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Director [nombre=");
		builder.append(this.getNombre());
		builder.append(", salario=");
		builder.append(this.getSalario());
		builder.append(", fecha de nacimiento=");
		builder.append(this.getFechaNacimiento().toString());
		builder.append(", DNI=");
		builder.append(this.getDni());
		builder.append(", incentivoDirector=");
		builder.append(incentivoDirector);
		builder.append(", matriculaCoche=");
		builder.append(matriculaCoche);
		builder.append("]");
		return builder.toString();
	}
	
}
