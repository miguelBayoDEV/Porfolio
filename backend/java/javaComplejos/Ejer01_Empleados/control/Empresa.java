package control;

import gui.Menu;
import lombok.Data;
import servicio.IServicio;
import servicio.Servicio;
import tools.OperacionesScanner;

@Data
public class Empresa {

	private IServicio servicio = new Servicio();
	
	public void init() {
		boolean comprobar = true;
		do {
			Menu.menu();
			comprobar = this.opciones();
		} while(comprobar);
	}
	
	public boolean opciones() {
		boolean comprobar = true;
		int opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");
		
		switch(opcion) {
		case 1:
			servicio.addEmpleado();
			break;
		case 2:
			servicio.removeEmpleado();
			break;
		case 3:
			servicio.updateEmpleado();
			break;
		case 4:
			servicio.showListaEmpleados();
			break;
		case 5:
			servicio.incentivarEmpleado();
			break;
		case 6:
			servicio.showEmpleado();
			break;
		case 7:
			comprobar = false;
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println("Opción numérica incorrecta.");
		}
		
		return comprobar;
	}
}
