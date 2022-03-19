package daw.caja;

public class Caja {
	
	
		private boolean abierto;
		private String mensaje;
		
		public Caja(String m) {
			this(false, m);
		}
		public Caja(boolean a, String m) {
			abierto = a;
			mensaje = m;
		}
		public Caja() {
			// this("Viva el tema 7");  // tiramos del primer constructor

			this(false, "Viva el tema 7"); // tiramos del segundo constructor
		}
		
		//Ejercicio 8 método.
		public void setMensaje(String m) {
			if(abierto) {
				mensaje=m;
			}
		}
	
		//Ejercicio 13
		
		public void abrir() {
			if(!abierto) {
				abierto=true;
			}
		}
		
		public void cerrar() {
			if(abierto) {
				abierto=false;
			}
		}
		
		public String getMensaje() {			
			return abierto ? mensaje : null;
		}
	}
		
}
