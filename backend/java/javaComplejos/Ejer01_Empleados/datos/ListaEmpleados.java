package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import gui.Menu;
import lombok.Data;
import model.Director;
import model.Empleado;
import model.Gerente;
import tools.OperacionesScanner;

@Data
public class ListaEmpleados implements IListaEmpleados {

	List<Empleado> listaEmpleado = new ArrayList<>();

	@Override
	public boolean addEmpleado(Empleado e) {
		boolean resultado = listaEmpleado.add(e);
		return resultado;
	}

	@Override
	public boolean removeEmpleado(Empleado e) {
		boolean resultado = listaEmpleado.remove(e);
		return resultado;
	}

	@Override
	public Empleado updateEmpleado(Empleado e) {
		boolean comprobar = true;
		do {
			if(e instanceof Gerente) {
				e = (Gerente) e;
				Menu.menuModificarGerente();
			}else if(e instanceof Director) {
				e = (Director) e;
				Menu.menuModificarDirector();
			}else if(e instanceof Empleado) {
				e = (Empleado) e;
				Menu.menuModificarEmpleado();
			}
			comprobar = this.modificarAtributo(e);
		} while(comprobar);
		return e;
	}

	@Override
	public List<Empleado> showListaEmpleados() {
		List<Empleado> lista = new ArrayList<>();
		for(Empleado e: listaEmpleado) {
			lista.add(e);
		}
		return lista;
	}

	@Override
	public boolean incentivarEmpleado(Empleado e) {
		boolean resultado = false;
		
		if(e instanceof Gerente) {
			System.out.println("Salario antes era: " + e.getSalario());
			((Gerente) e).incentivoGerente();
			System.out.println("Salario ahora es: " + e.getSalario());
		}else if(e instanceof Director) {
			System.out.println("Salario antes era: " + e.getSalario());
			((Director) e).incentivoGerente();
			System.out.println("Salario ahora es: " + e.getSalario());
		}
		
		return resultado;
	}

	@Override
	public void imprimirListaEmpleados(List<Empleado> lista) {
		System.out.println("Registro de empleados de la empresa:");
		for(Empleado e: lista) {
			System.out.println(e.toString());
		}
	}

	@Override
	public Empleado encontrarEmpleado() {
		boolean repetir = true;
		Empleado empleado = null;
		
		do {
			String dniEmpleado = OperacionesScanner.leerDato("Introduzca DNI del empleado: ");
			for(Empleado e: listaEmpleado) {
				if(dniEmpleado.equalsIgnoreCase(e.getDni())) {
					empleado = e;
				}
			}
			
			Optional<Empleado> optional = Optional.of(empleado);
			
			if(optional.isPresent()) {
				repetir = false;
			}
		} while(repetir);
		
		return empleado;
	}

	@Override
	public Empleado crearEmpleado() {
		String nombre = OperacionesScanner.leerDato("Introduzca nombre del empleado:");
		double salario = OperacionesScanner.leerNumeroDecimalDouble("Introduzca salario empleado:");
		LocalDate fechaNacimiento = OperacionesScanner.leerFechaNacimiento();
		String dni = OperacionesScanner.leerDato("Introduzca DNI  del empleado:");
		boolean isGerente = OperacionesScanner.leerDatoBooleano("¿El empleado es gerente? Introduzca S (verdad) o F (falso):");
		boolean isDirector = OperacionesScanner.leerDatoBooleano("¿El empleado es director? Introduzca S (verdad) o F (falso):");
		
		Empleado empleado = null;
		
		if(isGerente) {
			String departamento = OperacionesScanner.leerDato("Introduzca departamento:");
			empleado = new Gerente(nombre, salario, fechaNacimiento, dni, departamento);
		}else if(isDirector) {
			String matriculaCoche = OperacionesScanner.leerDato("Introduzca matrícula coche:");
			empleado = new Director(nombre, salario, fechaNacimiento, dni, matriculaCoche);
		}else {
			empleado = new Empleado(nombre, salario, fechaNacimiento, dni);
		}
		
		return empleado;
	}

	@Override
	public void imprimirEmpleado(Empleado e) {
		System.out.println(e.toString());
	}

	@Override
	public boolean modificarAtributo(Empleado e) {
		boolean resultado = true;
		do {
			int opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción:");
			if(e instanceof Gerente) {
				e = (Gerente) e;
				switch(opcion) {
				case 1:
					String nombre = OperacionesScanner.leerDato("Introduzca nuevo nombre del empleado:");
					e.setNombre(nombre);
					break;
				case 2:
					double salario = OperacionesScanner.leerNumeroDecimalDouble("Introduzca nuevo salario del empleado:");
					e.setSalario(salario);
					break;
				case 3:
					LocalDate fechaNacimiento = OperacionesScanner.leerFechaNacimiento();
					e.setFechaNacimiento(fechaNacimiento);
					break;
				case 4:
					String dni = OperacionesScanner.leerDato("Introduzca nuevo DNI del empleado:");
					e.setDni(dni);
					break;
				case 5:
					String departamento = OperacionesScanner.leerDato("Introduzca nuevo departamento del empleado:");
					((Gerente) e).setDepartamento(departamento);
					break;
				case 6:
					resultado = false;
					break;
				default:
					System.out.println("Opción numérica incorrecta.");
				}
			}else if(e instanceof Director) {
				e = (Director) e;
				switch(opcion) {
				case 1:
					String nombre = OperacionesScanner.leerDato("Introduzca nuevo nombre del empleado:");
					e.setNombre(nombre);
					break;
				case 2:
					double salario = OperacionesScanner.leerNumeroDecimalDouble("Introduzca nuevo salario del empleado:");
					e.setSalario(salario);
					break;
				case 3:
					LocalDate fechaNacimiento = OperacionesScanner.leerFechaNacimiento();
					e.setFechaNacimiento(fechaNacimiento);
					break;
				case 4:
					String dni = OperacionesScanner.leerDato("Introduzca nuevo DNI del empleado:");
					e.setDni(dni);
					break;
				case 5:
					String matriculaCoche = OperacionesScanner.leerDato("Introduzca nuevo matrícula del coche del empleado:");
					((Director) e).setMatriculaCoche(matriculaCoche);
					break;
				case 6:
					resultado = false;
					break;
				default:
					System.out.println("Opción numérica incorrecta.");
				}
			}else if(e instanceof Empleado) {
				e = (Empleado) e;
				switch(opcion) {
				case 1:
					String nombre = OperacionesScanner.leerDato("Introduzca nuevo nombre del empleado:");
					e.setNombre(nombre);
					break;
				case 2:
					double salario = OperacionesScanner.leerNumeroDecimalDouble("Introduzca nuevo salario del empleado:");
					e.setSalario(salario);
					break;
				case 3:
					LocalDate fechaNacimiento = OperacionesScanner.leerFechaNacimiento();
					e.setFechaNacimiento(fechaNacimiento);
					break;
				case 4:
					String dni = OperacionesScanner.leerDato("Introduzca nuevo DNI del empleado:");
					e.setNombre(dni);
					break;
				case 5:
					resultado = false;
					break;
				default:
					System.out.println("Opción numérica incorrecta.");
				}
			}
		} while(resultado);
		
		return resultado;
	}
	
}
