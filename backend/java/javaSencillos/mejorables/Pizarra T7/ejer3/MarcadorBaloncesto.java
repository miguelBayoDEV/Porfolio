package daw.ejer3;
import java.io.*;
import java.io.IOException;
import java.time.LocalDate;

public class MarcadorBaloncesto {
	
	//Propiedades de la clase.
	private String nombreLocal;
	private String nombreVisitante;
	private int puntosLocal;
	private int puntosVisitante;
	private LocalDate fecha;
	
	//Constructores.
	public MarcadorBaloncesto(String nL, String nV) {
		this(nL,0,nV,0,LocalDate.now());
	}
	
	public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
		this(nL,0,nV,0,f);
	}
	
	private MarcadorBaloncesto(String nL, int pL, String nVl, int pV, LocalDate fecha) {
		nombreLocal=nL;
		puntosLocal=pL;
		nombreVisitante=nVl;
		puntosVisitante=pV;
		this.fecha=fecha;
	}
	
	//Ejercicio 9 métodos.
	public void añadirCanasta(char equipo, int puntos) {
		if(equipo=='L') {
			if(puntos>0&&puntos<=3) {
				puntosLocal+=puntos;
			}
		}else if(equipo=='V') {
			if(puntos>0&&puntos<=3) {
				puntosLocal+=puntos;
			}
		}
	}
	
	public void reset() {
		puntosLocal=0;
		puntosVisitante=0;
	}
	
	//Ejercicio 15 métodos.
	public int getPuntosLocal() {
		return puntosLocal;
	}
	
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	
	public boolean ganaLocal() {
		boolean ganaL=false;
		if(puntosLocal>puntosVisitante) {
			ganaL=true;
		}
		return ganaL;
	}
	
	public boolean ganaVisitante() {
		boolean ganaV=false;
		if(puntosVisitante>puntosLocal) {
			ganaV=true;
		}
		return ganaV;
	}
	
	public boolean hayEmpate() {
		boolean empate=false;
		if(puntosLocal==puntosVisitante) {
			empate=true;
		}
		return empate;
	}
	
	//Ejercicio 19 CheckedException.
	public void guardar(String ruta) throws IOException {
		PrintWriter txt = new PrintWriter(ruta);
		txt.println(nombreLocal);
		txt.println(puntosLocal);
		txt.println(nombreVisitante);
		txt.println(puntosVisitante);
		txt.close();
	}
}
