import java.util.*;
public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escribe el numero de tu DNI: ");
		int dni = s.nextInt();
		
		int comprobacion = dni % 23;
		char letra = 0;
		
		
		if(comprobacion == 0) {
			
			letra = 'T';
			
		}else if(comprobacion == 1) {
			
			letra = 'R';
			
		}else if(comprobacion == 2) {
			
			letra = 'W';
			
		}else if(comprobacion == 3) {
			
			letra = 'A';
			
		}else if(comprobacion == 4) {
			
			letra = 'G';
			
		}else if(comprobacion == 5) {
			
			letra = 'M';
			
		}else if(comprobacion == 6) {
			
			letra = 'Y';
			
		}else if(comprobacion == 7) {
			
			letra = 'F';
			
		}else if(comprobacion == 8) {
			
			letra = 'P';
			
		}else if(comprobacion == 9) {
			
			letra = 'D';
			
		}else if(comprobacion == 10) {
			
			letra = 'X';
			
		}else if(comprobacion == 11) {
			
			letra = 'B';
			
		}else if(comprobacion == 12) {
			
			letra = 'N';
			
		}else if(comprobacion == 13) {
			
			letra = 'J';
			
		}else if(comprobacion == 14) {
			
			letra = 'Z';
			
		}else if(comprobacion == 15) {
			
			letra = 'S';
			
		}else if(comprobacion == 16) {
			
			letra = 'Q';
			
		}else if(comprobacion == 17) {
			
			letra = 'V';
			
		}else if(comprobacion == 18) {
			
			letra = 'H';
			
		}else if(comprobacion == 19) {
			
			letra = 'L';
			
		}else if(comprobacion == 20) {
			
			letra = 'C';
			
		}else if(comprobacion == 21) {
			
			letra = 'K';
			
		}else if(comprobacion == 22) {
			
			letra = 'E';
			
		}else{
			
			letra = 'T';
			
		}

		
		System.out.println("La letra de tu DNI es "+letra);
		
	}

}
