import java.lang.*;
public class Ejercicio37 {

	public static void main(String[] args) {
		// Crear programa que muestre por pantalla informaci�n del ordenador.
		System.out.println("Informaci�n sobre el ordenador: ");
		String n = System.getProperty("os.name");
		System.out.println("- Sistema operativo: "+n);
		String v = System.getProperty("os.version");
		System.out.println("- Versi�n del sistema operativo: "+v);
		String a = System.getProperty("os.arch");
		System.out.println("- Arquitectura del sistema operativo: "+a);
		String u = System.getProperty("user.name");
		System.out.println("- Usuario actual: "+u);
		String tmp = System.getenv("Temp");
		System.out.println("- Carpeta de archivos temporales: "+tmp);
	}

}
