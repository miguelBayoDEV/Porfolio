package CuotasClub_Ejer18;

import java.util.ArrayList;
import java.util.List;

public class Club {

	private static final double CUOTA_INICIAL = 500;
	private static List<Socio> clientes = new ArrayList<>();
	
	public static String calcularCuota() {
		double cuota = CUOTA_INICIAL;
		String resultado = "Clientes: ";
		
		for(Socio cliente: clientes) {
			int edadCliente = cliente.getEdad();
			if(edadCliente > 64) {
				cuota -= (CUOTA_INICIAL * 0.5);
			}else if(edadCliente < 18 && cliente.isPadreSocio()) {
				cuota -= (CUOTA_INICIAL * 0.35);
			}else if(edadCliente < 18) {
				cuota -= (CUOTA_INICIAL * 0.25);
			}else if(cliente.isMujer()) {
				cuota -= (CUOTA_INICIAL * 0.15);
			}
			resultado += cliente.getNombre() + " " + cliente.getApellidos() + " - cuota " + cuota + ", ";
			cuota = CUOTA_INICIAL;
		}
		resultado = resultado.substring(0, resultado.length() - 2);
		resultado += ".";
		
		return resultado;
	}
	
	public static void crearCliente(Socio cliente) {
		clientes.add(cliente);
	}
	
}
