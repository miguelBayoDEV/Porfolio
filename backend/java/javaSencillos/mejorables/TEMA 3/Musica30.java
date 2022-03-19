import bpc.daw.musica.*;
public class Musica30 {

	public static void main(String[] args) {
		//Creamos la canción
		NotaMusical do1 = new NotaMusical(0,2);
		NotaMusical do2 = new NotaMusical(0,2);
		NotaMusical sol1= new NotaMusical (4,2);
		NotaMusical sol2 = new NotaMusical (4,2);
		NotaMusical la1 = new NotaMusical (5,2);
		NotaMusical la2 = new NotaMusical (5,2);
		NotaMusical sol3 = new NotaMusical (4,1);
		NotaMusical fa1 = new NotaMusical (3,3);
		NotaMusical fa2 = new NotaMusical (3,3);
		NotaMusical mi1 = new NotaMusical (2,3);
		NotaMusical mi2 = new NotaMusical (2,3);
		NotaMusical re1 = new NotaMusical (1,4);
		NotaMusical mi3 = new NotaMusical (2,4);
		NotaMusical fa3 = new NotaMusical (3,4);
		NotaMusical re2 = new NotaMusical (1,4);
		NotaMusical do3 = new NotaMusical (0,2);
		
		//Creamos los instrumentos
		Piano p = new Piano();
		Guitarra g = new Guitarra();
		
		///Añadimos las notas musicales a la canción
		Cancion c = new Cancion("Ejercicio30");
		c.añadir(do1);
		c.añadir(do2);
		c.añadir(sol1);
		c.añadir(sol2);
		c.añadir(la1);
		c.añadir(la2);
		c.añadir(sol3);
		c.añadir(fa1);
		c.añadir(fa2);
		c.añadir(mi1);
		c.añadir(mi2);
		c.añadir(re1);
		c.añadir(mi3);
		c.añadir(fa3);
		c.añadir(re2);
		c.añadir(do3);
		
		//Reproducimos con piano y guitarra
		boolean r1 = p.reproducir(c);
		boolean r2 = g.reproducir(c);
	}

}
