package CuentaCorriente_Ejer10;

import java.util.ArrayList;
import java.util.List;

public class Cajero {

	private String nombreBanco;
	private String direccion;
	private List<CuentaCorriente> cuentas;
	
	
	public Cajero(String nombreBanco, String direccion) {
		super();
		this.nombreBanco = nombreBanco;
		this.direccion = direccion;
		this.cuentas = new ArrayList<>();
	}


	public String getNombreBanco() {
		return nombreBanco;
	}


	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<CuentaCorriente> getCuentas() {
		return cuentas;
	}


	public void setCuentas(List<CuentaCorriente> cuentas) {
		this.cuentas = cuentas;
	}
	
	public void addCuenta(CuentaCorriente cuenta) {
		this.cuentas.add(cuenta);
	}


	@Override
	public String toString() {
		return "Cajero [nombreBanco=" + nombreBanco + ", direccion=" + direccion + ", cuentas=" + cuentas + "]";
	}
	
	public void ingresar(Ordenante ordenante, double cantidadIngresar, String identificador) {
		for(CuentaCorriente cuenta: this.cuentas) {
			if(cuenta.getIdentificador() == identificador) {
				double cantidadCuenta = cuenta.getCantidadDepositada();
				cantidadCuenta += cantidadIngresar;
				cuenta.setCantidadDepositada(cantidadCuenta);
			}
		}
	}
}
