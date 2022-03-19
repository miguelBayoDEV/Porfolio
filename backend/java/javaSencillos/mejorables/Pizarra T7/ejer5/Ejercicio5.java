package daw.ejer5;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Oficina o1 = new Oficina("DAW");
		System.out.println(o1);
		
		Oficina o2 = new Oficina("DAM", 0);
		System.out.println(o2);
		
		Oficina o3 = new Oficina("DAM", 1);
		System.out.println(o3);
		
		Oficina o4 = new Oficina("DAM", 2);
		System.out.println(o4);
		
		Oficina o5 = new Oficina("DAM", 3);
		System.out.println(o5);
		
		Oficina o6 = new Oficina("DAM", 7);
		System.out.println(o6);
		
		Oficina o7 = new Oficina();
		System.out.println(o7);
	}

}
