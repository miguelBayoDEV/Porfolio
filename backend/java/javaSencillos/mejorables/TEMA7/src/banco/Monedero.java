package daw.banco;

public class Monedero implements Adinerado {

	private double dinero;
	
	/* CONSTRUCTOR */
	public Monedero() {
	
			dinero=0;
		
	}
	
	@Override
	public double getDineroTotal() {
		return dinero;
	}

	@Override
	public boolean a�adirDinero(int cantidad) {
		boolean a�adir=true;
		if (cantidad>0&&(cantidad+dinero<1000)) {
			dinero=dinero+cantidad;
			a�adir=true;
		}else {
			a�adir=false;
		}
		return a�adir;
	}

	@Override
	public boolean retirarDinero(int cantidad) {
		boolean retirar=true;
		if (dinero>=cantidad&&cantidad>0) {
			dinero=dinero-cantidad;
			retirar=true;
		}else {
			retirar=false;
		}
		return retirar;
	}

}
