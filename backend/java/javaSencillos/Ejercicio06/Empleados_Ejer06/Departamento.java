package Empleados_Ejer06;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nombre;
	private String ubicacion;
	private String telefono;
	private List<Empleado> empleados;
	
	
	public Departamento(String nombre, String ubicacion, String telefono) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.empleados = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public List<Empleado> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void removeEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}


	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", telefono=" + telefono + ", empleados="
				+ empleados + "]";
	}
	
}
