import java.lang.*;
public class Ejercicio29{
	public static void main(String[] args){
		
		
		int edad=Integer.parseInt(args[0]);

		boolean menorEdad= edad<18;
		boolean mayor60= edad>60;
		
		boolean descuento= menorEdad||mayor60;
		// boolean descuento=(edad<18) || (edad>60);
		
		System.out.println("Se le aplica el descuento "+descuento);
		
	}
}