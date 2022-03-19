import java.lang.*;
public class Ejercicio{
	public static void main(String[] args){
		int sueldo = 1000;
		System.out.println("Gano "+sueldo+" euros.");
		
		// Se le pone la palabra final antes de una variable para hacer una constante.
		final double PI = 3.1415;
		
		// Asignación: cambiar el valor de una variable por otro valor (del mismo tipo de dato).
		sueldo = 800;
		System.out.println("Ahora gano "+sueldo+" euros.");
		
		String estudio = "Estudio en el HLanz.";
		System.out.println(estudio);
		estudio = "Estoy en primero.";
		System.out.println(estudio);
		
		// La varible boleana solo guarda: true o false.
		boolean repetidor = true;
		System.out.println(repetidor);
		
		// Los días del año sin contar que es bisiesto y que sea la variable convertida a constante.
		final int año = 365;
		System.out.println(año);
		
		final char primeraLetraMayúscula = 'A';
		
		// Realización de operaciones con variables.
		int numero1 = 40;
		int numero2 = 20;
		
		// Cuando sumamos hay que guardar el resultado en una variable nueva.
		int resultado = numero1 + numero2;
		System.out.println(resultado);
		resultado = numero1 - numero2;
		System.out.println(resultado);
		resultado = numero1 * numero2;
		System.out.println(resultado);
		resultado = numero1 * (numero1 + numero2);
		System.out.println(resultado);
		
		// Quiero calcular el cuadrado de 5.
		int numero = 5;
		int cuadrado = numero * numero;
		System.out.println(cuadrado);
		
		/*
		   Haz un programa que tenga una variable llamada dinero y lo mostrará por pantalla.
		   A continuación, se subirá el sueldo un 10%.
		   El nuevo dinero se monstrará en pantalla.
		*/
		int dinero = 1200;
		System.out.println("Cobraba "+dinero+" euros.");
		double nuevoDinero = dinero + dinero * 0.1;
		System.out.println("Ahora cobraré "+nuevoDinero+" euros.");
		
		/*
			Tengo una variable que se llama nota y guarda un 1.785.
			Calcula cuántos puntos han faltado para aprobar.
		*/
		double nota = 1.785;
		int Aprobado = 5;
		double Resultado = Aprobado - nota;
		System.out.println("Me ha faltado "+resultado+" puntos para aprobar.");
		
		int velocidad = 90;
		int duración = 3;
		int km = velocidad * duración;
		System.out.println("Recorro "+km+" km.");
	}
}