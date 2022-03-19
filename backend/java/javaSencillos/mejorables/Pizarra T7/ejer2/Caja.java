package daw.ejer2;

public class Caja {
	
	//Propiedades de la clase.
	private boolean abierto;
	private String mensaje;
	
	//Constructores.
	public Caja(String m) {
		this(false,m);
	}
	
	public Caja(boolean a, String m) {
		abierto=a;
		mensaje=m;
	}
	
	public Caja() {
		this(false,"Viva el tema 7");
	}
	
	//Ejercicio 8 método.
	public void setMensaje(String m) {
		if(abierto) {
			mensaje=m;
		}
	}
	
	//Ejercicio 13 métodos.
	public void abrir() {
		if(abierto) {
			abierto=true;
		}
	}
	
	public void cerrar() {
		if(!abierto) {
			abierto=false;
		}
	}
	
	public String getMensaje() {
		mensaje=abierto?mensaje:null;
		return mensaje;
	}
}
