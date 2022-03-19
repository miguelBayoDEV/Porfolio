import bpc.daw.objetos.*;
import java.lang.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		// Mostrar un partido de baloncesto de Estudiantes vs CB Granada con sus canastas, nombre equipos, puntos, ganador y perdedor.
		MarcadorBaloncesto marcador = new MarcadorBaloncesto("CB Granada","Estudiantes");
		boolean canasta1 = marcador.anotarCanasta('V', 2);
		boolean canasta2 = marcador.anotarCanasta('L', 3);
		boolean canasta3 = marcador.anotarCanasta('V', 2);
		boolean canasta4 = marcador.anotarCanasta('L', 2);
		boolean canasta5 = marcador.anotarCanasta('L', 3);
		boolean canasta6 = marcador.anotarCanasta('V', 1);
		boolean canasta7 = marcador.anotarCanasta('V', 1);
		boolean canasta8 = marcador.anotarCanasta('L', 2);
		String local = marcador.getNombreLocal();
		String visitante = marcador.getNombreVisitante();
		int local1 = marcador.getPuntosLocal();
		int visitante1 = marcador.getPuntosVisitante();
		String resultado = marcador.toString();
		System.out.println(resultado);
		String ganador = marcador.getNombreEquipoGanador();
		System.out.println("El equipo ganador es: "+ganador);
		String perdedor = marcador.getNombreEquipoPerdedor();
		System.out.println("El equipo perdedor es: "+perdedor);
	}

}
