import java.lang.*;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		List<String> mensajes = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		boolean repetir = true;
		while(repetir) {
			System.out.println("Menu (elegir un n�mero del 1 al 7):");
			System.out.println("1) A�adir mensaje.");
			System.out.println("2) Consultar tama�o.");
			System.out.println("3) Consultar mensaje.");
			System.out.println("4) Comprobar mensaje.");
			System.out.println("5) Consultar todos los mensajes.");
			System.out.println("6) Borrar todo.");
			System.out.println("7) Salir.");
			String opcion = s.nextLine();
			
			if(opcion.equals("1")) {
				System.out.println("Introduzca un mensaje: ");
				opcion = s.nextLine();
				mensajes.add(opcion);
			}
			if(opcion.equals("2")) {
				System.out.println("N�mero de mensajes que hay en la lista mensajes: "+mensajes.size());
			}
			if(opcion.equals("3")) {
				if(mensajes.isEmpty()) {
					System.out.println("No hay mensajes.");
					repetir=false;
				}else {
					int n = mensajes.size()-1;
					System.out.println("Introduzca un n�mero entre 0 y "+n+" para consultar dicho mensaje: ");
					opcion = s.nextLine();
					int nu = Integer.parseInt(opcion);
					if(nu>=0&&nu<=n) {
						String msg = mensajes.get(nu);
						System.out.println(msg);
					}else {
						System.out.println("N�mero introducido no est� dentro del rango.");
					}
				}
			}
			if(opcion.equals("4")) {
				System.out.println("Introduce otro mensaje para ver si est� en la lista: ");
				opcion = s.nextLine();
				int pos = mensajes.indexOf(opcion);
				
				String opt = mensajes.get(pos);
				if(opcion.equals(opt)) {
					System.out.println("Mensaje est� en la lista: "+opt+" y posici�n: "+pos);
				}
				if(opt.equals("-1")||!opcion.equals(opt)){
					System.out.println("Mensaje no est� en la lista.");
				}
			}
			if(opcion.equals("5")) {
				for(int i=0;i<mensajes.size();i++) {
					System.out.println(mensajes.get(i));
				}
			}
			if(opcion.equals("6")) {
				mensajes.clear();
			}
			if(opcion.equals("7")) {
				repetir = false;
			}
		}
	}

}
