import java.lang.*;
public class Ejercicio32 {
	public static void main(String[] args){
		double nota1 = 6.50;
		double nota2 = 4.20;
		double nota3 = 5.75;
		double nota4 = 3.50;
		double nota5 = 8.00;
		int n�meroEx�menes = 5;
		int n�meroFaltas = 10;
		double notaMedia = (nota1+nota2+nota3+nota4+nota5)/n�meroEx�menes;
		boolean resultado = (notaMedia>4)&&(n�meroFaltas<=10);
		// Esta condici�n se modific� por la de arriba: boolean resultado3 = (notaMedia>5)&&(n�meroFaltas>10);
		boolean resultado1 = (notaMedia>7)&&(n�meroFaltas>15)&&(n�meroFaltas<=20);		
		boolean resultadoTotal = resultado||resultado1;
		System.out.println("�El alumno ha aprobado? "+resultadoTotal);
	}
}