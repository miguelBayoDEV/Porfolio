import java.lang.*;
public class Ejercicio30{
	public static void main(String[] args){
		boolean adulto = true;
		boolean acompanado = false;
		
		boolean abre_puerta = adulto || acompanado;
		
		System.out.println(abre_puerta);
	}
}