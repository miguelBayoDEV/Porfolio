import java.lang.*;
public class Ejercicio14 {
	public static void main(String[] args){
		double películaEl_padrino = 3.5;
		double películaOdisea_2001 = 2.95;
		int días = 2;
		// Se multiplica cada película por los días y se suman.
		double pagoDos_días = (películaEl_padrino * días) + (películaOdisea_2001 * días);
		// Como el resultado es false sería que NO, si el resultado fuese true sería SÍ. También pagoDos_días<=5.
		boolean billete_5 = 5>=pagoDos_días;
		System.out.println("El dinero que se necesita para alquilar dos días estas dos películas son: "+pagoDos_días+" euros.");
		System.out.println("¿Será suficiente un billete de 5 euros para pagar dicho alquiler? "+billete_5);
	}
}