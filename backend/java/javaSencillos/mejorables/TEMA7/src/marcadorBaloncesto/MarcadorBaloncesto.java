package daw.marcadorBaloncesto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;

public class MarcadorBaloncesto {
	private String nombreLocal;
	private String nombreVisitante;
	private int puntosLocal;
	private int puntosVisitante;
	private LocalDate fecha;
	
	public MarcadorBaloncesto(String nL, String nV) {
		//this(nL,0,nV,0,LocalDate.now());
		
		this(nL,nV,LocalDate.now());
	}
	
	public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
		this(nL,0,nV,0,f);
	}
	
	private MarcadorBaloncesto (String nL, int pL, String nV, int pV, LocalDate fecha) {
		nombreLocal=nL;
		puntosLocal=pL;
		nombreVisitante=nV;
		puntosVisitante=pV;
		this.fecha=fecha;
	}
	
	/*public void añadirCanasta(char equipo,int puntos) {
		//boolean puede = false;
		if(puntos==1||puntos==2||puntos==3) {
			if(equipo=='L') {
				this.puntosLocal+=puntos;
			}else if(equipo=='V'){
				this.puntosVisitante+=puntos;
			}
		}
		
//		/*if(equipo=='L'&&puede) {
//			this.puntosLocal+=puntos;
//		}else if(equipo=='V'&&puede){
//			this.puntosVisitante+=puntos;
//		}*/
		
	}*/
	
	public void reset() {
		this.puntosLocal=0;
		this.puntosVisitante=0;
	}
	
	public int getPuntosLocal() {
		
		return puntosLocal;
	}
	public int getPuntosVisitante() {
		
		return puntosVisitante;
	}
	public boolean ganaLocal() {
		/*boolean gana = false;
		if(puntosLocal>puntosVisitante) {
			gana=true;
		}
		return gana;*/
		//return (puntosLocal>puntosVisitante)? true:false;
		return puntosLocal>puntosVisitante;
	}
	public boolean ganaVisitante() {
		/*boolean gana = false;
		if(puntosVisitante>puntosLocal) {
			gana=true;
		}
		return gana;*/
		return puntosVisitante>puntosLocal;
	}
	public boolean hayEmpate() {
		/*boolean empate = false;
		if(puntosLocal == puntosVisitante) {
			empate=true;
		}
		return empate;*/
		return puntosLocal==puntosVisitante;
	}
	
	public void guardar(String ruta) throws IOException {
		
			File archivo = new File(ruta);
			FileWriter fl = new FileWriter(archivo);
			fl.write("Equipo Local: " + nombreLocal + " - " + puntosLocal + " ; Equipo Visitante: " + nombreVisitante
					+ " - " + puntosVisitante);
			fl.close();
		
	}
	/* Ejercicio 20 : Programa el método añadirCanasta del marcador de baloncesto para que lance una IllegalArgumentException si se 
	 * pasa un char que no sea L,V o unos puntos no validos. */
	public void añadirCanasta(char equipo, int puntos) { 
		if (puntos == 1 || puntos == 2 || puntos == 3) {
			if (nombreLocal == "L") {
				puntosLocal += puntos;
			} else if (nombreLocal == "V") {
				nombreVisitante += puntos;
			} else {
				throw new IllegalArgumentException("El nombre introducido no es correcto.");
			}
		} else {
			throw new IllegalArgumentException ("Los puntos introducidos no son válidos.");
		}
	}
}
