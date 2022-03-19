package model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Empleado {

	private String nombre;
	private double salario;
	private LocalDate fechaNacimiento;
	private String dni; // Como clave primaria para buscarlo en el ArrayList
	
	
	public Empleado(String nombre, double salario, LocalDate fechaNacimiento, String dni) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}
}
