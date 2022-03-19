import java.lang.*;
public class Ejercicio49 {
	public static void main(String[] args){
		int dinero = 7787;
		int billete500 = 500;
		int billete100 = 100;
		int billete50 = 50;
		int billete20 = 20;
		int billete10 = 10;
		int moneda2 = 2;
		int moneda1 = 1;
		int billete500a = dinero/billete500;
		int billete100a = dinero%billete500;
		int billete100b = billete100a/billete100;
		int billete50a = billete100a%billete100;
		int billete50b = billete50a/billete50;
		int billete20a = billete50a%billete50;
		int billete20b = billete20a/billete20;
		int billete10a = billete20a%billete20;
		int billete10b = billete10a/billete10;
		int moneda2a = billete10a%billete10;
		int moneda2b = moneda2a/moneda2;
		int moneda1a = moneda2a%moneda2;
		int moneda1b = moneda1a/moneda1;
		System.out.println("Hay "+billete500a+" billetes de 500 euros.");
		System.out.println("Hay "+billete100b+" billetes de 100 euros.");
		System.out.println("Hay "+billete50b+" billete de 50 euros.");
		System.out.println("Hay "+billete20b+" billete de 20 euros.");
		System.out.println("Hay "+billete10b+" billete de 10 euros.");
		System.out.println("Hay "+moneda2b+" monedas de 2 euros.");
		System.out.println("Hay "+moneda1b+" moneda de 1 euro.");
	}
}