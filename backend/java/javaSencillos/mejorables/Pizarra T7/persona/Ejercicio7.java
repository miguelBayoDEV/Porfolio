package daw.persona;
import daw.persona.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		CuentaCorriente c = new CuentaCorriente(1, 500);
		c.añadirDinero(-20);
		c.añadirDinero(40);
		c.retirarDinero(-20);
		c.retirarDinero(70);
	}

}
