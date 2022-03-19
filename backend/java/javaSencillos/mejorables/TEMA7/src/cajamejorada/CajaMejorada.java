package daw.cajamejorada;
import java.util.Optional;

public class CajaMejorada {
	private String mensaje;
	private boolean abierta;

	public CajaMejorada(String m) {
		this.mensaje = m;
		abierta=false;
		if (m == null) {
			IllegalArgumentException ex = new IllegalArgumentException("Mensaje erroneo");
		} else {
			this.mensaje = m;
		}
		//  Los métodos abrir y cerrar sirven para abrir y cerrar la caja
		// respectivamente

	}

	public void abrir() {
		abierta = true;

	}

	public void cerrar() {
		abierta = false;

	}
	//Si la caja está abierta, devuelve un Optional<String> rellenado con el mensaje que hay en la caja.
	//o Si la caja está cerrada, devuelve un Optional<String> vacío.
	public Optional<String> getMensaje(){
		/*Optional<String> op1=null;
		if(abierta==false) {;
			 op1=Optional.empty();
		}else {
			op1=Optional.of(this.mensaje);
			
		}
		return op1;*/
		
		//return abierta?Optional.of(mensaje):Optional.empty();
		
		return Optional.ofNullable(abierta?mensaje:null);
		
	}
}
