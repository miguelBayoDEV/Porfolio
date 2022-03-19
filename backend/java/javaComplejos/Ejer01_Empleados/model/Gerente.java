package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Gerente extends Empleado {

	private boolean incentivoGerente;
	private String departamento;
	
	
	public Gerente(String nombre, double salario, LocalDate fechaNacimiento, String dni, String departamento) {
		super(nombre, salario, fechaNacimiento, dni);
		this.incentivoGerente = true;
		this.departamento = departamento;
	}
	
	public void incentivoGerente() {
		setSalario(this.getSalario() * 1.05);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gerente [nombre=");
		builder.append(this.getNombre());
		builder.append(", salario=");
		builder.append(this.getSalario());
		builder.append(", fecha de nacimiento=");
		builder.append(this.getFechaNacimiento().toString());
		builder.append(", DNI=");
		builder.append(this.getDni());
		builder.append(", incentivoGerente=");
		builder.append(incentivoGerente);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append("]");
		return builder.toString();
	}
	
}
