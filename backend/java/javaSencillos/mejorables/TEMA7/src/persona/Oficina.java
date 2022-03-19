package daw.persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import daw.CuentaCoriente.CuentaCorriente;

public class Oficina {
	private String nombre;
	private ArrayList<Persona> trabajadores;

	private Oficina(String nombre) {
		this(nombre, 0);
	}

	/*public Oficina(String nombre, int tipo) {
		this.nombre = nombre;
		trabajadores = new ArrayList<>();
		if (tipo > 0 && tipo <= 3) {
			trabajadores.add(new Persona("Antonio Perez Perez", new DNI(11111111, 'H'), 900, LocalDate.of(2000, 2, 28)));
			if (tipo > 1) {
				trabajadores.add(new Persona("Luis Lopez Lopez", new DNI(22222222, 'J'), 1000, LocalDate.of(1995, 9, 10)));
				if (tipo == 3) {
					trabajadores.add(new Persona("Ana Diaz Diaz", new DNI(33333333, 'P'), 1200, LocalDate.of(1985, 5, 21)));

				}
			}

		}
	}*/
	
	private Oficina(String nombre, int tipo) {
		this.nombre = nombre;
		trabajadores = new ArrayList<>();
		if (tipo > 0 && tipo <= 3) {
			trabajadores.add(new Persona("Antonio Perez Perez", new DNI(11111111, 'H'),900, LocalDate.of(2000, 2, 28)));
			if (tipo > 1) {
				trabajadores.add(new Persona("Luis Lopez Lopez", new DNI(22222222, 'J'), 1000, LocalDate.of(1995, 9, 10)));
				if (tipo == 3) {
					trabajadores.add(new Persona("Ana Diaz Diaz", new DNI(33333333, 'P'), 1200, LocalDate.of(1985, 5, 21)));

				}
			}

		}else {
			throw new IllegalArgumentException("Error en el int tipo");
		}
	}

	private Oficina() {
		this("Industrias DAW", 3);
	}
	//Ejercicio 11:
	
		public void añadirEmpleado(Persona p) {			
			trabajadores.add(p);
		}
		
		public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac) {
			Persona p = new Persona(nombre, new DNI(DNI), sueldo, fechaNac);
			trabajadores.add(p);
		}
		
		public int getTotalEmpleados() {
			return trabajadores.size();
		}
		
		public int getTotalEmlpleadosMileuristas() {
			int mil = 0;
			/*for(int i=0;i<this.getTotalEmpleados();i++) {
				Persona e=trabajadores.get(i);
				if(e.esMileurista()) {
					mil++;
				}
			}*/
			
			for(Persona e:trabajadores) {
				if(e.esMileurista()) {
					mil++;
				}
			}
			return mil;
		}
		
		public List<Persona> getMileuristas(){
			List<Persona> a = new ArrayList<>();
			for(int i=0;i<this.getTotalEmpleados();i++) {
				if(trabajadores.get(i).esMileurista()) {
					a.add(trabajadores.get(i));
				}
			}
			return a;
		}
		
		public boolean trabaja(Persona p) {
			return trabajadores.contains(p);
		}
		
		public void pagarEmpleados() {
			for(int i=0;i<getTotalEmpleados();i++) {
				trabajadores.get(i).cobrarSueldo();
			}
		}
		
		public void mostrarInformeEmpleados() {
			for(int i=0;i<getTotalEmpleados();i++) {
				System.out.println(trabajadores.get(i).getNombre()+" "+trabajadores.get(i).getSueldo()+" "+trabajadores.get(i).esMileurista());
			}
		}
	
		public double getSueldoMedio() throws Exception{
			
			double media = 0;
			double mediaTotal = 0;
			int trabajadoresTotales = trabajadores.size();
			
			if(!trabajadores.isEmpty()) {
				
				for(Persona persona : trabajadores) {
					
					media+=persona.getSueldo();	
					
				}	
				
				
			}else {
			
				throw new Exception("Esta mal, no hay ningún trabajadores inscrito en la lista");
			
			}
			return media/trabajadoresTotales;
		}
		
		public static Oficina getOficinaVacia() {
			return new Oficina("Empresa");
		}
		
		public static Oficina getOficinaPequeña() {
			return new Oficina("Empresa",1);
		}
		
		public static Oficina getOficinaMediana() {
			return new Oficina("Empresa",2);
		}
		
		public static Oficina getOficinaGrande() {
			return new Oficina("Empresa",3);
		}

}
