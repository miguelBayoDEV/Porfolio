package daw.dragonball;

public class BolaDragon {
	private static final int MAXIMO_BOLAS;
	private static int siguienteBola;
	private int numero;
	
	static {
		MAXIMO_BOLAS=7;
		siguienteBola=1;
	}
	
	private BolaDragon(int numero) {
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public static BolaDragon crearBolaDragon() throws Exception{
		BolaDragon b=null;
		if(siguienteBola>MAXIMO_BOLAS) {
			throw new Exception("Ya se han creado 7 bolas de dragón.");
		}else {
			b=new BolaDragon(siguienteBola);
			siguienteBola++;
		}
		
		return b;
	}

}
