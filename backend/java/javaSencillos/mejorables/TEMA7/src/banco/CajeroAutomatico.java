package daw.banco;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CajeroAutomatico implements Adinerado {
	private Map<Integer, Integer> billetes;

	public CajeroAutomatico() {
		billetes = new HashMap<>();

		billetes.put(1, 0);
		billetes.put(5, 0);
		billetes.put(10, 0);
		billetes.put(20, 0);
		billetes.put(50, 0);
	}

	@Override
	public double getDineroTotal() {
		double total = 0;
		Set<Integer> valores= billetes.keySet();

		for (Integer n : valores) {
			total += (n*billetes.get(n));
		}

		return total;
	}

	@Override
	public boolean añadirDinero(int cantidad) {
		boolean añadir = false;
		if (cantidad > 0) {
			int billete50 = cantidad / 50;
			int resto50 = cantidad % 50;

			billetes.replace(50, billetes.get(50) + billete50);

			int billete20 = resto50 / 20;
			int resto20 = resto50 % 20;
			billetes.replace(20, billetes.get(20) + billete20);

			int billete10 = resto20 / 10;
			int resto10 = resto20 % 10;
			billetes.replace(10, billetes.get(10) + billete10);

			int billete5 = resto10 / 5;
			billetes.replace(5, billetes.get(5) + billete5);

			int moneda1 = resto10 % 5;
			billetes.replace(1, billetes.get(1) + moneda1);
			añadir = true;
		}
		return añadir;

	}

	@Override
	public boolean retirarDinero(int cantidad) {
		boolean retirar = true;
		if (this.getDineroTotal()>cantidad) {
			
			int billete50 = cantidad / 50;
			int resto50 = cantidad % 50;

			if (billetes.get(50) > billete50) {
				billetes.replace(50, billetes.get(50) - billete50);
			}

			int billete20 = resto50 / 20;
			int resto20 = resto50 % 20;
			if (billetes.get(20) > billete20) {
				billetes.replace(20, billetes.get(20) - billete20);
			}

			int billete10 = resto20 / 10;
			int resto10 = resto20 % 10;
			if (billetes.get(10) > billete10) {
				billetes.replace(10, billetes.get(10) - billete10);
			}

			int billete5 = resto10 / 5;

			if (billetes.get(5) > billete5) {
				billetes.replace(5, billetes.get(5) - billete5);
			}

			int moneda1 = resto10 % 5;
			if (billetes.get(1) > moneda1) {
				billetes.replace(1, billetes.get(1) - moneda1);
			}

			retirar = true;
		}
		return retirar;

	}

}
