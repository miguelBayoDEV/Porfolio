import java.lang.*;
import bpc.daw.objetos.*;
public class Ejercicio47 {

	public static void main(String[] args) {
		//Crear un marcador nuevo de partido de baloncesto como el ejercicio 12 y compararlos.
		MarcadorMejorado mmb = new MarcadorMejorado("CB Granada","Estudiantes");
		final int L = MarcadorMejorado.CANASTA_LOCAL;
		final int V = MarcadorMejorado.CANASTA_VISITANTE;
		final int TL = MarcadorMejorado.TIRO_LIBRE;
		final int TN = MarcadorMejorado.NORMAL;
		final int TT = MarcadorMejorado.TRIPLE;
		MarcadorMejorado c1 = mmb.anotarCanasta(V,TN);
		MarcadorMejorado c2 = mmb.anotarCanasta(L,TT);
		MarcadorMejorado c3 = mmb.anotarCanasta(V,TN);
		MarcadorMejorado c4 = mmb.anotarCanasta(L,TN);
		MarcadorMejorado c5 = mmb.anotarCanasta(L,TT);
		MarcadorMejorado c6 = mmb.anotarCanasta(V,TL);
		MarcadorMejorado c7 = mmb.anotarCanasta(V,TL);
		MarcadorMejorado c8 = mmb.anotarCanasta(L,TN);
		String nl = mmb.getNombreLocal();
		int pl = mmb.getPuntosLocal();
		String nv = mmb.getNombreVisitante();
		int pv = mmb.getPuntosVisitante();
		String mt = mmb.toString();
		System.out.println(mt);
		String ganador = mmb.getNombreEquipoGanador();
		System.out.println("El equipo ganador es: "+ganador);
		String perdedor = mmb.getNombreEquipoPerdedor();
		System.out.println("El equipo perdedor es: "+perdedor);
		//Este ejercicio es mejor porque como ya tienes las constantes no te hace falta crear variables ahorrándote trabajo al programar.
	}

}
