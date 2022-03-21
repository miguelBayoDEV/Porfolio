package control;

import gui.Menu;
import lombok.Data;
import servicio.IServicio;
import servicio.Servicio;
import tools.OperacionesScanner;

@Data
public class Biblioteca {

	private IServicio servicio = new Servicio();
	
	public void init() {
		boolean comprobar = true;
		do {
			Menu.menuGeneral();
			comprobar = this.opciones();
		} while(comprobar);
	}
	
	public boolean opciones() {
		boolean comprobar = true;
		int opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");
		
		switch(opcion) {
		case 1:
			servicio.addProducto();
			break;
		case 2:
			servicio.removeProducto();
			break;
		case 3:
			servicio.updateProducto();
			break;
		case 4:
			servicio.numeroProducto();
			break;
		case 5:
			servicio.generarListado();
			break;
		case 6:
			comprobar = false;
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println("Opción numérica incorrecta.");
		}
		
		return comprobar;
	}
}
