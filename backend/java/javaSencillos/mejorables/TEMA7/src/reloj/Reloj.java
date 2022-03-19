package daw.reloj;

import java.time.LocalTime;

public class Reloj {
	private LocalTime hora;
	
	public Reloj() {
		hora=LocalTime.now();
	}
	
	public void añadir(int segundos) {
		hora=hora.plusSeconds(segundos);
	}
	
	public boolean esNoche() {
		LocalTime noche=LocalTime.of(22, 00);
		LocalTime mañana=LocalTime.of(8, 00);
		boolean deshoras=false;
		if(hora.isAfter(noche) && hora.isBefore(mañana)) {
			deshoras=true;
		}
		
		return deshoras;
	}
	
	public void esperar(int segundos) {
		try {
			Thread.sleep(segundos*1000);
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		hora=LocalTime.now();
	}
	
	public String toString() {
		int horas=hora.getHour();
		int minutos=hora.getMinute();
		int segundos=hora.getSecond();
		
		return horas+":"+minutos+":"+segundos;
	}

}
