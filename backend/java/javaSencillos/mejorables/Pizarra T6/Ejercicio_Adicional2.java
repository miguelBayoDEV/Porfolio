import java.lang.*;
import java.util.*;
public class Ejercicio_Adicional2 {

	public static void main(String[] args) {
		
		//Recorrer de la lista de esta forma: Lunes, Domingo, Martes, Sábado, Miércoles, Viernes y Jueves.
		List<String> lista = new ArrayList<>();
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Miércoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("Sábado");
		lista.add("Domingo");
		
		System.out.println(lista);
		
		//Intercambiar los ordenes de las palabras.
		//String n = lista.set(1, lista.get(6)); //lista.size()-1;
		//String n0 = lista.set(2, n);
		//String n1 = lista.set(3, lista.get(5));
		//String n2 = lista.set(4, n0);
		//String n3 = lista.set(5, n2);
		//String n4 = lista.set(6, n1);
		
		//System.out.println(lista.toString());
		
		System.out.println("Orden de la lista alternando entre extremos hasta llegar al centro: ");
		boolean repetir = true;
		boolean repetir1 = true;
		while(lista.size()!=0) {
			for(int i=0;i<lista.size()&&repetir;i++) {
				System.out.println(lista.get(i));
				if(lista.remove(lista.get(i))) {
					repetir=false;
					repetir1=true;
				}
			}
			for(int i=lista.size()-1;i>=0&&repetir1;i--) {
				System.out.println(lista.get(i));
				if(lista.remove(lista.get(i))) {
					repetir1=false;
					repetir=true;
				}
			}
		
		}	
		
	}

}
