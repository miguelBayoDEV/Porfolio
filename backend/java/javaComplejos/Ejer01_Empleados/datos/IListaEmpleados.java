package datos;

import java.util.List;

import model.Empleado;

public interface IListaEmpleados {
	boolean addEmpleado(Empleado e);
	boolean removeEmpleado(Empleado e);
	Empleado updateEmpleado(Empleado e);
	List<Empleado> showListaEmpleados();
	boolean incentivarEmpleado(Empleado e);
	void imprimirEmpleado(Empleado e);
	void imprimirListaEmpleados(List<Empleado> listaEmpleado);
	Empleado encontrarEmpleado();
	Empleado crearEmpleado();
	boolean modificarAtributo(Empleado e);
}
