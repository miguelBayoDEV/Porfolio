package Coche_Ejer02;

import java.util.Arrays;

public class Coche {

	private String modelo;
	private String color;
	private boolean metalizada;
	private String matricula;
	private String tipoCoche;
	private int yearFabricacion;
	private String modalidadSeguro;
	
	
	public Coche() {}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMetalizada() {
		return metalizada;
	}
	public void setMetalizada(boolean metalizada) {
		this.metalizada = metalizada;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipoCoche() {
		return tipoCoche;
	}
	public void setTipoCoche(String tipoCoche) {
		this.tipoCoche = tipoCoche;
	}
	public int getYearFabricacion() {
		return yearFabricacion;
	}
	public void setYearFabricacion(int yearFabricacion) {
		this.yearFabricacion = yearFabricacion;
	}
	public String getModalidadSeguro() {
		return modalidadSeguro;
	}
	public void setModalidadSeguro(String modalidadSeguro) {
		this.modalidadSeguro = modalidadSeguro;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + ", metalizada=" + metalizada + ", matricula="
				+ matricula + ", tipoCoche=" + tipoCoche + ", yearFabricacion=" + yearFabricacion
				+ ", modalidadSeguro=" + modalidadSeguro + "]";
	}
	
}
