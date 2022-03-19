package Ejercicio33aaron;
import bpc.daw.consola.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		Consola c=new Consola();
		CapaTexto tex= c.getCapaTexto();
		Teclado tec= c.getTeclado();
		
		Random aleatorio= new Random();
		
		int maxX= tex.getNumeroFilas();
		int maxY= tex.getNumeroColumnas();
		 
		int jY= tex.getNumeroColumnas()/2;
		int jX= tex.getNumeroFilas()/2;
		
		int pasos=80;
		
		int tesoroX=2+aleatorio.nextInt(maxX-2);
		int tesoroY=aleatorio.nextInt(maxY);
		
		int puntos=0;
		int nivel=1;
		
		int pistaX=2+aleatorio.nextInt(maxX-2);
		int pistaY=aleatorio.nextInt(maxY);
		
		int pasosX=2+aleatorio.nextInt(maxX-2);
		int pasosY=aleatorio.nextInt(maxY);
		
		int centroX=2+aleatorio.nextInt(maxX-2);
		int centroY=aleatorio.nextInt(maxY);
		
		boolean continua = true;
		
		

			try {
				tex.print(0, (maxY/3), "ENCUENTRA EL TESORO");
				tex.print(2, 0, "CONTROLES");
				tex.print(4, 0, "W -> Moverse hacia arriba");
				tex.print(5, 0, "S -> Moverse hacia abajo");
				tex.print(6, 0, "A -> Moverse hacia la izquierda");
				tex.print(7, 0, "D -> Moverse hacia la derecha");
				tex.print(2, (maxY/2), "Pistas");
				tex.print(4, (maxY/2), "Muy Frio = + de 25 Casillas");
				tex.print(5, (maxY/2), "Frio = entre 52 y 10 casillas");
				tex.print(6, (maxY/2), "Caliente = entre 10 y 5 casillas");
				tex.print(7, (maxY/2), "Quemandote = - de 5 casillas");
				tex.print((maxX/2), (maxY/3), "Instrucciones:");
				tex.print((maxX/2)+2, 0, "Dispones de 80 movimientos para encontrar el tesoro");
				tex.print((maxX/2)+3, 0, "Si lo encuentras subiras de nivel");
				tex.print((maxX/2)+4, 0, "y tus movimientos restantes se sumaran a puntos");
				tex.print((maxX/2)+5, 0, "Cada vez tendras menos movimientos");
				tex.print((maxX/2)+6, 0, "Si tus movimientos llegan a 0 se acaba la partida");
				tex.print((maxX/2)+7, 0, "La casilla M te dara mas movimientos");
				tex.print((maxX/2)+8, 0, "La casilla P te enseñara brevemente donde esta el tesoro");
				
				Thread.sleep(10000);
				tex.cls();
				
			}catch(InterruptedException error) {
				System.out.println("Error de interrupcion");
			}
			
		
		
		tec.setTipoCursor(Teclado.CURSOR_NULO);
		
		
		
		while(pasos>=0&&continua==true) {
			
			//Dibujo del menu superior
			tex.situarCursor(0, 0);
			tex.print("Nivel "+nivel);
			tex.situarCursor(0,10);
			tex.print("Puntos: "+puntos);
			tex.print(1, 0, "-----------------------------------------------------------------");
			tex.situarCursor(0,23);
			tex.print("Movimientos: "+pasos);
			
			
			
			//posicion del personaje
			tex.print(jX,jY, "O");
			
			//posicion del tesoro
			tex.print(tesoroX, tesoroY, "");
			
			//Calculo de la distancia
			double distancia= Math.sqrt(Math.pow((jX-tesoroX),(2))+Math.pow((jY-tesoroY),(2)));
			
			//Pista segun la distancia
			if(distancia>=25) {
				tex.situarCursor(0,50);
				tex.print("Muy Frio");
			}
			if(distancia<25&&distancia>10) {
				tex.situarCursor(0,50);
				tex.print("Frio");
			}
			if(distancia<=10&&distancia>5) {
				tex.situarCursor(0,50);
				tex.print("Caliente");
			}
			if(distancia<=5) {
				tex.situarCursor(0,50);
				tex.print("Quemandote");
			}
			
			//Generador de pistas 
			tex.print(pasosX, pasosY, "M");
			tex.print(pistaX, pistaY, "P");
			tex.print(centroX, centroY, "*");
			
			//Si llega a la casilla M consigue movimientos y refresca las pistas
			if(jX==pasosX&& jY==pasosY) {
				pasos+=10;
				tex.cls();
				
				centroX=2+aleatorio.nextInt(maxX-2);
				centroY=aleatorio.nextInt(maxX);
				
				pasosX=2+aleatorio.nextInt(maxX-2);
				pasosY=aleatorio.nextInt(maxX);
				
				pistaX=2+aleatorio.nextInt(maxX-2);
				pistaY=aleatorio.nextInt(maxX);
				
				tex.situarCursor(0, 0);
				tex.print("Nivel "+nivel);
				tex.situarCursor(0,10);
				tex.print("Puntos: "+puntos);
				tex.print(1, 0, "-----------------------------------------------------------------");
				tex.situarCursor(0,23);
				tex.print("Movimientos: "+pasos);
				
				tex.print(pasosX, pasosY, "M");
				tex.print(pistaX, pistaY, "P");
				tex.print(centroX, centroY, "*");
				
				tex.print(jX,jY, "O");
				tex.print(tesoroX, tesoroY, "");
			}
			//Si nos colocamos en la casilla * nos devuelve al centro 
			if(jX==centroX&& jY==centroY) {
				jY= tex.getNumeroColumnas()/2;
				jX= tex.getNumeroFilas()/2;
				
				tex.cls();
				
				centroX=2+aleatorio.nextInt(maxX-2);
				centroY=aleatorio.nextInt(maxX);
				
				pasosX=2+aleatorio.nextInt(maxX-2);
				pasosY=aleatorio.nextInt(maxX);
				
				pistaX=2+aleatorio.nextInt(maxX-2);
				pistaY=aleatorio.nextInt(maxX);
				
				tex.situarCursor(0, 0);
				tex.print("Nivel "+nivel);
				tex.situarCursor(0,10);
				tex.print("Puntos: "+puntos);
				tex.print(1, 0, "-----------------------------------------------------------------");
				tex.situarCursor(0,23);
				tex.print("Movimientos: "+pasos);
				
				tex.print(pasosX, pasosY, "M");
				tex.print(pistaX, pistaY, "P");
				tex.print(centroX, centroY, "*");
				
				tex.print(jX,jY, "O");
				tex.print(tesoroX, tesoroY, "");
			}
			
			//Si llega a la casilla P se vera por un breve tiempo donde esta el tesoro y reinicia las pistas.
			if(jX==pistaX&& jY==pistaY) {
				
				try {
				tex.print(tesoroX, tesoroY, "$");
				Thread.sleep(100);
				
				}catch(InterruptedException error) {
					System.out.println("Error de interrupcion");
				}
				tex.cls();
				
				centroX=2+aleatorio.nextInt(maxX-2);
				centroY=aleatorio.nextInt(maxX);
				
				pasosX=2+aleatorio.nextInt(maxX-2);
				pasosY=aleatorio.nextInt(maxX);
				
				pistaX=2+aleatorio.nextInt(maxX-2);
				pistaY=aleatorio.nextInt(maxX);
				
				tex.situarCursor(0, 0);
				tex.print("Nivel "+nivel);
				tex.situarCursor(0,10);
				tex.print("Puntos: "+puntos);
				tex.print(1, 0, "-----------------------------------------------------------------");
				tex.situarCursor(0,23);
				tex.print("Movimientos: "+pasos);
				
				tex.print(pasosX, pasosY, "M");
				tex.print(pistaX, pistaY, "P");
				tex.print(centroX, centroY, "*");
				
				tex.print(jX,jY, "O");
				tex.print(tesoroX, tesoroY, "");
			}
			
			tec.leerCaracter();
			
			//Movimiento arriba y abajo
			if(tec.teclaPulsada(KeyEvent.VK_W)==true&&jX>2) {
				jX--;
				pasos--;
			}
			if(tec.teclaPulsada(KeyEvent.VK_S)==true&&jX<maxX-1) {
				jX++;
				pasos--;
			}
			
			//Movimiento izquierda y derecha
			if(tec.teclaPulsada(KeyEvent.VK_A)==true&&jY>0) {
				jY--;
				pasos--;
			}
			if(tec.teclaPulsada(KeyEvent.VK_D)==true&&jY<maxY-1) {
				jY++;
				pasos--;
			}
			
			tex.cls();
			
			//Si llega al tesoro esta es la subida de nivel
			if(jX==tesoroX && jY==tesoroY) {
				nivel++;
				puntos= puntos+pasos;
				pasos=80-(nivel*5);
				tesoroX=2+aleatorio.nextInt(maxX);
				tesoroY=aleatorio.nextInt(maxY);
				
				//Mensaje de subida de nivel
				try {
					tex.print(maxX/2, (maxY/2)-4, "Nivel "+nivel);
					Thread.sleep(1000);
					tex.cls();
					
				}catch(InterruptedException error) {
					System.out.println("Error de interrupcion");
				}
				
			}
			
			
			//Mensaje de final de partida
			if(pasos==0) {
				tex.situarCursor(0, 0);
				tex.print("Nivel "+nivel);
				tex.situarCursor(0,10);
				tex.print("Puntos: "+puntos);
				tex.print(1, 0, "-----------------------------------------------------------------");
				tex.situarCursor(0,23);
				tex.print("Movimientos: "+pasos);
				
				
				tex.print(tesoroX, tesoroY, "$");
				tex.print(maxX/2, (maxY/2)-4, "GAME OVER");
				tex.print((maxX/2)-2, (maxY/2)-15, "Quieres jugar otra partida?(S/N)");
				tec.leerCaracter();
				
				//Sin salir del programa si quieres puedes volver a jugar de nuevo.
				if(tec.teclaPulsada(KeyEvent.VK_S)==true) {
					tex.cls();
					nivel=1;
					puntos=0;
					pasos=80;
					jY= tex.getNumeroColumnas()/2;
					jX= tex.getNumeroFilas()/2;
					tesoroX=2+aleatorio.nextInt(maxX);
					tesoroY=aleatorio.nextInt(maxY);
				}else {
					continua=false;
				}
				
			}
		}
		
		
		
		

	}

}
