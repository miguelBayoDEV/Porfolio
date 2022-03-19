package daw.banco;

public class Banco implements Adinerado{

	private double dinero;
		
	/* CONSTRUCTOR */
	public Banco() {
		dinero=0;
	}
	
	@Override
	public double getDineroTotal() {
		return dinero;
	}

	@Override
	public boolean añadirDinero(int cantidad) {
		boolean añadir=true;
		if (cantidad<=0) {
			añadir=false;
		}else {
			dinero=dinero+cantidad;
		}
		
		return añadir;
	}

	@Override
	public boolean retirarDinero(int cantidad) {
		boolean retirar=true;
		if (dinero>=cantidad) {
			dinero=dinero-cantidad;
			retirar=true;
		}else {
			retirar=false;
		}
		return false;
	}
	
}
