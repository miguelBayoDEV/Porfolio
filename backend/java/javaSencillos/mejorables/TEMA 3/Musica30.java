import bpc.daw.musica.*;
public class Musica30 {

	public static void main(String[] args) {
		//Creamos la canci�n
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
		
		///A�adimos las notas musicales a la canci�n
		Cancion c = new Cancion("Ejercicio30");
		c.a�adir(do1);
		c.a�adir(do2);
		c.a�adir(sol1);
		c.a�adir(sol2);
		c.a�adir(la1);
		c.a�adir(la2);
		c.a�adir(sol3);
		c.a�adir(fa1);
		c.a�adir(fa2);
		c.a�adir(mi1);
		c.a�adir(mi2);
		c.a�adir(re1);
		c.a�adir(mi3);
		c.a�adir(fa3);
		c.a�adir(re2);
		c.a�adir(do3);
		
		//Reproducimos con piano y guitarra
		boolean r1 = p.reproducir(c);
		boolean r2 = g.reproducir(c);
	}

}
