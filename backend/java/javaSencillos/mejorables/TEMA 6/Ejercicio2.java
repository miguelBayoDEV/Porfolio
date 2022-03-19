package t6ej2;
import java.util.*;


public class Ejercicio2 {

	public static void main(String[] args) {

		List<String> mensajes= new ArrayList<>();
		
		String opt="";
		int tam=-1;
		String n="";
		String mens="";
		int num=0;
		Scanner s= new Scanner(System.in);
		do {
			System.out.println("1. Añadir mensaje");
			System.out.println("2. Consultar tamaño");
			System.out.println("3. Consultar mensaje");
			System.out.println("4. Comprobar mensaje");
			System.out.println("5. Consultar todo los mensajes");
			System.out.println("6. Borrar todo");
			System.out.println("7. Salir");
			
			opt=s.nextLine();
			switch (opt) {
				case "1":
					System.out.println("Introducir el mensaje");
					mens=s.nextLine();
					mensajes.add(mens);
					break;
				case "2":
					tam=mensajes.size();
					System.out.println("La lista tiene "+tam+" mensajes");
					break;
				case "3":
					tam=mensajes.size();
					if(tam<=0) {
						System.out.println("No hay mensajes");
					}else {
						System.out.println("Numero del mensaje (0 - "+(tam-1)+"):");
						n= s.nextLine();
						num=Integer.parseInt(n);
						if(num>=0&&num<tam) {
							System.out.println(mensajes.get(num));
						}else {
							System.out.println("Numero incorrecto");
						}
					}
					break;
				case "4":
					System.out.println("Mensaje a buscar:");
					mens=s.nextLine();
					num=mensajes.indexOf(mens);
					if(num<0) {
						System.out.println("No se ha encontrado");
					}else {
						System.out.println("Está en la posicion: "+num);
					}
					break;
				case "5":
					System.out.println(mensajes.toString());
					break;
				
				case "6":
					mensajes.clear();
					break;
				case "7":
					break;
				default:
					System.out.println("Opcion erronea");
			}
		}while(!opt.equals("7"));
			
	}

}
