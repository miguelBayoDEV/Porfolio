import java.lang.*;
public class Ejercicio32 {
	public static void main(String[] args){
		double nota1 = 6.50;
		double nota2 = 4.20;
		double nota3 = 5.75;
		double nota4 = 3.50;
		double nota5 = 8.00;
		int númeroExámenes = 5;
		int númeroFaltas = 10;
		double notaMedia = (nota1+nota2+nota3+nota4+nota5)/númeroExámenes;
		boolean resultado = (notaMedia>4)&&(númeroFaltas<=10);
		// Esta condición se modificó por la de arriba: boolean resultado3 = (notaMedia>5)&&(númeroFaltas>10);
		boolean resultado1 = (notaMedia>7)&&(númeroFaltas>15)&&(númeroFaltas<=20);		
		boolean resultadoTotal = resultado||resultado1;
		System.out.println("¿El alumno ha aprobado? "+resultadoTotal);
	}
}