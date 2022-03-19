package ej37tema3;

public class ej37tema3 {

	public static void main(String[] args) {
		String sistemaop=System.getProperty("os.name");
		String sistemaver=System.getProperty("os.version");
		String sistemaarc=System.getProperty("os.arch");
		String sistemaname=System.getProperty("user.name");
		String temportales=System.getenv("TEMP");
		System.out.println("Sistema operativo: "+sistemaop);
		System.out.println("Version del sistema operativo: "+sistemaver);
		System.out.println("Aruitectura del sistema: "+sistemaarc);
		System.out.println("Nombre del usuario: "+sistemaname);
		System.out.print("Carpeta de archivos temporales"+temportales);
		
		

	}

}
