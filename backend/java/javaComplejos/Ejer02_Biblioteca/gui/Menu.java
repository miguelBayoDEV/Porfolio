package gui;

public class Menu {

	public static void menuGeneral() {
		System.out.println("Opciones:");
		System.out.println("1. Añadir producto:");
		System.out.println("2. Eliminar producto:");
		System.out.println("3. Modificar producto:");
		System.out.println("4. Número de producto prestado:");
		System.out.println("5. Generar listado de productos:");
		System.out.println("6. Salir");
	}
	
	public static void menuCrear() {
		System.out.println("Opciones:");
		System.out.println("1. Añadir libro:");
		System.out.println("2. Añadir comic:");
		System.out.println("3. Añadir revista:");
		System.out.println("4. Añadir disco:");
	}
	
	public static void menuEliminar() {
		System.out.println("Opciones:");
		System.out.println("1. Eliminar libro:");
		System.out.println("2. Eliminar comic:");
		System.out.println("3. Eliminar revista:");
		System.out.println("4. Eliminar disco:");
	}
	
	public static void menuModificarLibro() {
		System.out.println("Opciones:");
		System.out.println("1. Modificar fecha de publicación:");
		System.out.println("2. Modificar nombre:");
		System.out.println("3. Modificar edición:");
		System.out.println("4. Modificar ISBN:");
		System.out.println("5. Modificar autor:");
		System.out.println("6. Modificar préstamo:");
	}
	
	public static void menuModificarComic() {
		System.out.println("Opciones:");
		System.out.println("1. Modificar fecha de publicación:");
		System.out.println("2. Modificar nombre:");
		System.out.println("3. Modificar número:");
		System.out.println("4. Modificar colección:");
		System.out.println("5. Modificar préstamo:");
	}
	
	public static void menuModificarRevista() {
		System.out.println("Opciones:");
		System.out.println("1. Modificar fecha de publicación:");
		System.out.println("2. Modificar nombre:");
		System.out.println("3. Modificar número:");
		System.out.println("4. Modificar periodicidad:");
		System.out.println("5. Modificar préstamo:");
	}
	
	public static void menuModificarDisco() {
		System.out.println("Opciones:");
		System.out.println("1. Modificar código:");
		System.out.println("2. Modificar fecha de publicación:");
		System.out.println("3. Modificar título:");
		System.out.println("4. Modificar duración:");
		System.out.println("5. Modificar formato:");
		System.out.println("6. Modificar préstamo:");
	}
	
	public static void menuNumeroProducto() {
		System.out.println("Opciones:");
		System.out.println("1. ¿Cuántos libros hay?:");
		System.out.println("2. ¿Cuántos comics hay?:");
		System.out.println("3. ¿Cuántas revistas hay?:");
		System.out.println("4. ¿Cuántos discos hay?:");
	}
	
	public static void menuListados() {
		System.out.println("Opciones:");
		System.out.println("1. Generar listado de publicaciones anteriores a una fecha:");
		System.out.println("2. Generar listado de libros:");
		System.out.println("3. Generar listado de comics:");
		System.out.println("4. Generar listado de revistas:");
		System.out.println("5. Generar listado de discos multimedia:");
		System.out.println("6. Generar listado de productos completos:");
	}
	
	public static void menuTipoProducto() {
		System.out.println("Tipos:");
		System.out.println("1. Libro:");
		System.out.println("2. Comic:");
		System.out.println("3. Revista:");
		System.out.println("4. Disco:");
	}
}
