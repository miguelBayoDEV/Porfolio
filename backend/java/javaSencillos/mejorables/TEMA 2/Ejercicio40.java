/*Ejercicio 40 : Realiza un programa que nos diga si x=2 es solución de la ecuación: 3x² − 8x = 3*/
import java.lang.*;
public class Ejercicio40{
  public static void main(String[] args){
    //Declaracion de variables y operaciones:
    int x=2;
    double funcion=3*(x*x)-8*x;
    boolean solucion=funcion==3;
	// boolean solucion=3*(x*x)-8*x==3;
	
//Muestra de resultados:
    System.out.println("Es solucion x="+x+" de la funcion?"+funcion+" ->"+ solucion);
  }
}
