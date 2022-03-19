package CuentaCorriente_Ejer10;

import java.time.LocalDate;

public class Cliente extends Ordenante {
	private LocalDate fechaNacimiento;
	private int codigo;


	public Cliente(String nombre, String apellidos, String dni, LocalDate fechaNacimiento, int codigo) {
		super(nombre, apellidos, dni);
		this.fechaNacimiento = fechaNacimiento;
		this.codigo = codigo;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Cliente [fechaNacimiento=" + fechaNacimiento + ", codigo=" + codigo + "]";
	}
	
}
