package ejercicio15;
import java.util.*;
public class Ejer15 {

	public static void main(String[] args) {
		Map<String,Integer> telefonos=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		boolean repetir=true;
		while(repetir) {
			System.out.println("1. Añadir entrada");
			System.out.println("2. Consultar teléfono");
			System.out.println("3. Mostrar listado");
			System.out.println("4. Salir");
			String resp=sc.nextLine();
			if(resp.equalsIgnoreCase("4")) {
				repetir=false;
			}else if(resp.equalsIgnoreCase("1")) {
				System.out.println("Escribe un nombre");
				String nombre=sc.nextLine();
				System.out.println("Escribe un teléfono");
				String telf=sc.nextLine();
				Integer num=Integer.parseInt(telf);
				telefonos.put(nombre, num);
			}else if(resp.equalsIgnoreCase("2")) {
				System.out.println("Escribe un nombre para consultar");
				String nomConsul=sc.nextLine();
				
				boolean esta=telefonos.containsKey(nomConsul);
				if(esta==true) {
					System.out.println("El teléfono de "+nomConsul+" está en la lista");
					System.out.println(telefonos.get(nomConsul));
				}else {
					System.out.println("El teléfono no está en la lista");
				}
			}else if(resp.equalsIgnoreCase("3")) {
				Set<String> nom=telefonos.keySet();
				for(String i:nom) {
					// i es el nombre de una persona
					Integer tel=telefonos.get(i);
					System.out.println("La persona "+i+" tiene el teéfono "+tel);
				}
			}
		}
	}

}
