import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Map<String,Integer> registro = new HashMap<>();
		
		//Menu.
		Scanner s = new Scanner(System.in);
		boolean repetir = true;
		while(repetir) {
			System.out.println("1.Añadir entrada");
			System.out.println("2.Consultar teléfono");
			System.out.println("3.Mostrar listado");
			System.out.println("4.Salir");
			
			System.out.println("Introduzca opción: ");
			String opcion = s.nextLine();
			
			if(opcion.equals("1")) {
				System.out.println("Introduzca nombre del usuario: ");
				String nombre = s.nextLine();
				System.out.println("Introduzca teléfono del usuario: ");
				int tel = s.nextInt();
				
				registro.put(nombre, tel);
			}else if(opcion.equals("2")) {
				System.out.println("Introduzca nombre del usuario para consulta: ");
				String nombre = s.nextLine();
				if(registro.containsKey(nombre)) {
					System.out.println("Teléfono de "+nombre+": "+registro.get(nombre));
				}else {
					System.out.println("No existe ese nombre de usuario.");
				}
			}else if(opcion.equals("3")) {
				Set<String> claves = registro.keySet();
				
				//Recuperar datos del Set.
				Iterator<String> ite = claves.iterator();
				/*
				while(ite.hasNext()) {
					String nombre = ite.next();
					System.out.println("Nombre: "+nombre+" "+"Teléfono: "+registro.get(nombre));
				}
				Esta es la forma antigua.
				*/
				
				//Se hace con un for mejorado.
				for(String n:claves) {
					System.out.println("Nombre: "+n+" "+"Teléfono: "+registro.get(n));
				}
			}else if(opcion.equals("4")) {
				repetir = false;
			}else {
				System.out.println("Opción incorrecta.");
			}
		}
	}

}
