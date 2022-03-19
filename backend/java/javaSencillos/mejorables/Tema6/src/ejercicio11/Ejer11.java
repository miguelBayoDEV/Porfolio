package ejercicio11;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejer11 {

	public static void main(String[] args) {
		String mayor = ""; 
		ArrayList<String> nombre = new ArrayList<>();
		
		nombre.add("Barcelona");
		nombre.add("Madrid");
		nombre.add("Sevilla");
		nombre.add("Valencia");
		nombre.add("Real Sociedad");
		nombre.add("Granada");
		
		for(String n:nombre) {
		
			if(n.length() > mayor.length()) {
			
				mayor = n;
			
			}
		}
		
		System.out.println(mayor);
		
			
	
	}
		
		
		
}


