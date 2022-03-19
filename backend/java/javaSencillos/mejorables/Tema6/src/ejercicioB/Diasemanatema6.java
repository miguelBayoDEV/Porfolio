package ejercicioB;
import java.util.Arrays;
import java.util.List;

public class Diasemanatema6 {

	public static void main(String[] args) {
		List<String> lista=Arrays.asList("Lunes","Martes","Miercoles","jueves","Viernes","Sabado","Domingo");
		int ultimo=lista.size();
		int quitar=lista.size()/2;
		quitar++;
		for(int i=0;i<ultimo-quitar;i++){
			System.out.print(lista.get(i)+" ");
			ultimo--;
			System.out.print(lista.get(ultimo)+" ");
		}
		ultimo--;
		System.out.print(lista.get(ultimo));
	}

}
