import java.lang.*;
public class Ejercicio49{
	public static void main(String[] args){
		
		int dinero = Integer.parseInt(args[0]);

		int b500 = dinero/500;
		dinero = dinero-b500*500;
 		
		int b100 = dinero/100;
		dinero = dinero-b100*100;
		
		int b50 = dinero/50;
		dinero = dinero-b50*50;
		
		int b20 = dinero/20;
		dinero = dinero-b20*20;
		
		int b10 = dinero/10;
		dinero = dinero-b10*10;

		int b5 = dinero/5;
		dinero = dinero-b5*5;
		
		int b2 = dinero/2;
		dinero = dinero-b2*2;
		
		int b1 = dinero;


		System.out.println("La cantidad de dinero : " +args[0]+" se descompone en billetes de: ");
		System.out.println("Billete de 500 : " +b500);
		System.out.println("Billete de 100 : " +b100);
		System.out.println("Billete de 50 : " +b50);
		System.out.println("Billete de 20 : " +b20);
		System.out.println("Billete de 10 : " +b10);
		System.out.println("Billete de 5 : " +b5);
		System.out.println("Monedas de 2 : " +b2);
		System.out.println("Monedas de 1 : " +b1);
	}

}