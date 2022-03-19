package CuentaCorriente_Ejer10;

import java.time.LocalDate;

public class CuentaCorriente {

	private String identificador;
	private Cliente cliente;
	private double cantidadDepositada;
	private LocalDate fechaCreacion;
	
	
	public CuentaCorriente(String identificador, Cliente cliente, double cantidadDepositada) {
		super();
		this.identificador = identificador;
		this.cliente = cliente;
		this.cantidadDepositada = cantidadDepositada;
		this.fechaCreacion = LocalDate.now();
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getCantidadDepositada() {
		return cantidadDepositada;
	}


	public void setCantidadDepositada(double cantidadDepositada) {
		this.cantidadDepositada = cantidadDepositada;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [identificador=" + identificador + ", cliente=" + cliente + ", cantidadDepositada="
				+ cantidadDepositada + "]";
	}
	
	public void comprobarBeneficios3PorcientoYear() {
		// Si sustituyes en el parámetro primero del método of de la clase LocalDate (LocalDate.now().getYear()) por 2025 por ejemplo
		LocalDate fechaBeneficio = LocalDate.of(LocalDate.now().getYear(), this.fechaCreacion.getMonth(), this.fechaCreacion.getDayOfMonth());
		int yearBeneficio = fechaBeneficio.getYear();
		int yearCreacion = fechaCreacion.getYear();
		int yearsDiferencia = yearBeneficio - yearCreacion;
		if(fechaBeneficio.isAfter(this.fechaCreacion)) {
			cantidadDepositada += yearsDiferencia * ((cantidadDepositada * 3) / 100.0);
		}
	}
	
}
