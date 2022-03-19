package servicio;

import java.util.List;

import datos.IListaEmpleados;
import datos.ListaEmpleados;
import lombok.Data;
import model.Empleado;

@Data
public class Servicio implements IServicio {

	private IListaEmpleados listaEmpleados = new ListaEmpleados();
	
	@Override
	public void addEmpleado() {
		Empleado empleado = listaEmpleados.crearEmpleado();
		listaEmpleados.addEmpleado(empleado);
	}

	@Override
	public void removeEmpleado() {
		Empleado empleado = listaEmpleados.encontrarEmpleado();
		listaEmpleados.removeEmpleado(empleado);
	}

	@Override
	public void updateEmpleado() {
		Empleado empleado = listaEmpleados.encontrarEmpleado();
		listaEmpleados.updateEmpleado(empleado);
	}

	@Override
	public void showListaEmpleados() {
		List<Empleado> lista = listaEmpleados.showListaEmpleados();
		listaEmpleados.imprimirListaEmpleados(lista);
	}

	@Override
	public void incentivarEmpleado() {
		Empleado empleado = listaEmpleados.encontrarEmpleado();
		listaEmpleados.incentivarEmpleado(empleado);
	}

	@Override
	public void showEmpleado() {
		Empleado empleado = listaEmpleados.encontrarEmpleado();
		listaEmpleados.imprimirEmpleado(empleado);
	}

}
