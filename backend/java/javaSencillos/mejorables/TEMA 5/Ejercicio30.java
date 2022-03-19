package tema5Ejercicio30b;

import java.util.*;

public class Ejercicio30 {

	public static void main(String[] args) {
	
		final String EXP_REG="[0-9]{8}[A-HJ-NP-TV-Z]";
		
		/*
		 * Una expresi�n regular es un patr�n que sirve para formatear, comprobar, definir... etc. una cadena de caracteres. 
		 * 
		 * La expresi�n regular se lee de izquierda a derecha y tiene una serie de s�mbolos, expresiones y
		 * meta caracteres que sirven para ir dando formato al patr�n
		 * 
		 * En este caso:
		 * [] -> Los corchetes definen un conjunto 
		 * {} -> las llaves definen una repetici�n de lo inmediatamente anterior
		 * ************************************************************************
		 * [0-9] -> los valores han de ser n�meros del intervalo del 0 al 9 -> ser�a equivalente a \\d
		 * [0-9]{8} -> [0-9] debe de ocurrir exactamente 8 veces
		 * [A-HJ-NP-TV-Z] -> a continuaci�n, se concatenan los caracteres que pueden tomar los valores del intervalo: 
		 * de la A a la H, de la J a la N, de la P a la T y de la V a la Z
		 */
	
	
		System.out.println("Introduce un DNI: ");
		
		String dni = new Scanner(System.in).nextLine();
	
		if(dni.matches(EXP_REG)) { //el m�todo matches comprueba el string que hemos metido con la expresi�n regular y devuelve true si el dni introducido tiene el formato correcto
			
			
			final String  LISTA_LETRAS="TRWAGMYFPDXBNJZSQVHLCKET"; //string con las letras en orden de la 0 a la 22 segun el resto: 0==T, 1==R, 2==W, etc.

			int resto= Integer.parseInt(dni.substring(0,8)) % 23; //cogemos solo la parte num�rica con substring(), lo convertimos en int para operar y hacemos el resto 
			
			String letra =dni.substring(8, 9); //cogemos la letra
			
			/*
			 * Comprobamos que la letra sea coincidente con la equivalente en la posici�n de la cadena LISTA LETRAS 
			 * el m�todo charAt devuelve un char, hay que hacer un valueOf para poder usar equals y comparar ambas cosas
			 */
			
			if(String.valueOf(LISTA_LETRAS.charAt(resto)).equals(letra)) {  
				
				System.out.println("Resto coincidente, DNI correcto");
			}
			
			else {
				
				System.out.println("Resto "+resto+" no coincidente con letra "+letra+" , DNI err�neo");
			}
			
		}else {
			System.out.println("DNI incorrecto");
		}
		
			
		}
		
	}


