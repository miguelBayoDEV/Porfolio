package juego;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoImagen;
import bpc.daw.consola.Sprite;
import bpc.daw.consola.Teclado;
public class Programa {

	public static void main(String[] args) {

		Consola c=new Consola();
		CapaTexto ct=c.getCapaTexto();
		Teclado t=c.getTeclado();
		
		try {
			ct.println("Cargando");
			List<String> rutas=Arrays.asList("link.png","fondo.jpg","bola.png");
			List<Image> imagenes=new ArrayList<>();
			
			for(int i=0;i<rutas.size();i++) {
				String ruta=rutas.get(i);
				File f=new File(ruta);
				Image foto=ImageIO.read(f);
				imagenes.add(foto);
			}
			
			ct.cls();
			long totalFrames=0;
			
			CapaSprites cs=c.getCapaSprites();
			
			Rectangle rectanguloBola=new Rectangle(486,487,228,230);
						
			
			List<Rectangle> izquierda=Arrays.asList(
					new Rectangle(0,568,103,103),
					new Rectangle(0,568,103,103),
					new Rectangle(0,568,103,103),
					new Rectangle(107,571,89,93),
					new Rectangle(107,571,89,93),
					new Rectangle(107,571,89,93),
					new Rectangle(207,565,83,69),
					new Rectangle(207,565,83,69),
					new Rectangle(207,565,83,69),
					new Rectangle(310,571,86,97),
					new Rectangle(310,571,86,97),
					new Rectangle(310,571,86,97),
					new Rectangle(412,563,95,101),
					new Rectangle(412,563,95,101),
					new Rectangle(412,563,95,101),
					new Rectangle(516,571,100,96),
					new Rectangle(516,571,100,96),
					new Rectangle(516,571,100,96),
					new Rectangle(622,571,83,95),
					new Rectangle(622,571,83,95),
					new Rectangle(622,571,83,95),
					new Rectangle(722,565,83,95),
					new Rectangle(722,565,83,95),
					new Rectangle(722,565,83,95),
					new Rectangle(922,658,100,97),
					new Rectangle(922,658,100,97),
					new Rectangle(922,658,100,97),
					new Rectangle(924,666,100,111),
					new Rectangle(924,666,100,111),
					new Rectangle(924,666,100,111)
					);
						
			List<Rectangle> derecha=Arrays.asList(
					new Rectangle(3,785,90,100),
					new Rectangle(3,785,90,100),
					new Rectangle(3,785,90,100),
					new Rectangle(110,786,86,99),
					new Rectangle(110,786,86,99),
					new Rectangle(110,786,86,99),
					new Rectangle(216,786,82,98),
					new Rectangle(216,786,82,98),
					new Rectangle(216,786,82,98),
					new Rectangle(309,788,89,98),
					new Rectangle(309,788,89,98),
					new Rectangle(309,788,89,98),
					new Rectangle(408,785,105,103),
					new Rectangle(408,785,105,103),
					new Rectangle(408,785,105,103),
					new Rectangle(521,791,92,94),
					new Rectangle(521,791,92,94),
					new Rectangle(521,791,92,94),
					new Rectangle(621,789,84,96),
					new Rectangle(621,789,84,96),
					new Rectangle(621,789,84,96),
					new Rectangle(734,788,82,91),
					new Rectangle(734,788,82,91),
					new Rectangle(734,788,82,91),
					new Rectangle(928,882,98,100),
					new Rectangle(928,882,98,100),
					new Rectangle(928,882,98,100),
					new Rectangle(924,777,102,111),					
					new Rectangle(924,777,102,111),
					new Rectangle(924,777,102,111)
					);
					
			int andar=0;
			
			CapaFondo cf=c.getCapaFondo();
			FondoImagen fi=new FondoImagen(imagenes.get(1));
			fi.setEscalado(true);
			cf.setFondo(fi);
			
			Sprite link=cs.crearSprite(imagenes.get(0), derecha.get(0), 50,650);
			//Sprite bola=cs.crearSprite(imagenes.get(2),rectanguloBola,10,50);
			
			int nivel=1;
			
			// AQUÍ EMPIEZA EL JUEGO
			long inicio=System.currentTimeMillis();
			
			CapaCanvas cv=c.getCapaCanvas();
			Graphics g=cv.getGraphics();
			boolean juego=true;
			while(juego) {
				cv.cls();
				g.drawString("Nivel "+nivel, 50, 50);
				
				int velocidad=5;
				
				List<Sprite> bolas=new ArrayList<>();
				List<Integer> velocidades=new ArrayList<>();
				
				Random r=new Random();
				for(int i=0;i<nivel;i++) {
					int x=r.nextInt(1200);
					Sprite bola=cs.crearSprite(imagenes.get(2), rectanguloBola,x , 50);
					int velocidadBola=2+r.nextInt(nivel*3);
					bolas.add(bola);
					velocidades.add(velocidadBola);
				}
				
				
				// BUCLE PRINCIPAL DEL JUEGO
				boolean repetir=true;
				while(repetir) {
					
					// ACTUALIZAR LA BOLA
					for(int i=0;i<bolas.size();i++) {
						Sprite bola=bolas.get(i);
						int v=velocidades.get(i);
						bola.moverY(v);		
						if(bola.getY()>=650|| bola.getY()<=10) {
							velocidades.set(i, -v);
						}
						
						if(link.comprobarColision(bola)) {
							g.drawString("GAME OVER", 100, 100);
							t.setTipoCursor(Teclado.CURSOR_NULO);
							t.leerCaracter();
							nivel=1;
							link.setPosicion(10, 650);
						}
						
					}
					
					// ACTUALIZAR EL JUGADOR
					if(t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
						repetir=false;
						juego=false;
					}else if(t.teclaPulsada(KeyEvent.VK_RIGHT)) {					
						if(link.getX()<1200) {
							link.moverX(velocidad);
							andar++;
							if(andar==derecha.size()) {
								andar=0;
							}
							Rectangle nuevo=derecha.get(andar);
							link.setRectanguloFrame(nuevo);
						}else {
							// HEMOS PASADO DE NIVEL
							nivel++;
							repetir=false;
							link.setPosicion(10, 650);
							
							for(int i=0;i<bolas.size();i++) {
								Sprite bola=bolas.get(i);
								cs.eliminarSprite(bola);
							}
							
						}
					}else if(t.teclaPulsada(KeyEvent.VK_LEFT)){
						if(link.getX()>=10) {
							link.moverX(-velocidad);
						}
						andar++;
						if(andar==izquierda.size()) {
							andar=0;
						}
						Rectangle nuevo=izquierda.get(andar);
						link.setRectanguloFrame(nuevo);
					}
					
					
					
					
					
					c.esperarSiguienteFrame();
					totalFrames++;
				}
			}
			// EL JUEGO YA SE HA ACABADO
			long fin=System.currentTimeMillis();
			long tiempoMilisegundos=fin-inicio;
			System.out.println("FPS: "+(totalFrames/(tiempoMilisegundos/1000.0)));

		}catch(IOException error) {
			ct.println("Error "+error.getMessage());
		}
	}

}
