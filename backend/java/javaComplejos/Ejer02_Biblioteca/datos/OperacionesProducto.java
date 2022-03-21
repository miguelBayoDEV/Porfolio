package datos;

import java.time.LocalDate;
import java.time.LocalTime;

import gui.Menu;
import model.Comic;
import model.Disco;
import model.Formato;
import model.Libro;
import model.Multimedia;
import model.ProductoPrestable;
import model.Revista;
import tools.OperacionesScanner;

public class OperacionesProducto {

	public static ProductoPrestable crearPoducto() {

		ProductoPrestable producto = null;

		int opcion = 0;
		do {
			Menu.menuCrear();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				producto = OperacionesProducto.crearLibro();
				break;
			case 2:
				producto = OperacionesProducto.crearComic();
				break;
			case 3:
				producto = OperacionesProducto.crearRevista();
				break;
			case 4:
				producto = OperacionesProducto.crearDisco();
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 4);

		return producto;
	}

	public static Libro crearLibro() {
		LocalDate fechaPublicacion = OperacionesScanner.leerFechaPublicacion();
		String nombre = OperacionesScanner.leerDato("Introduzca nombre del libro:");
		String edicion = OperacionesScanner.leerDato("Introduzca edición del libro:");
		String isbn = OperacionesScanner.leerDato("Introduzca ISBN del libro:");
		String autor = OperacionesScanner.leerDato("Introduzca autor del libro:");

		return new Libro(fechaPublicacion, nombre, edicion, isbn, autor);
	}

	public static Comic crearComic() {
		LocalDate fechaPublicacion = OperacionesScanner.leerFechaPublicacion();
		String nombre = OperacionesScanner.leerDato("Introduzca nombre del comic:");
		int numero = OperacionesScanner.leerNumeroEnteroInt("Introduzca número del comic:");
		String coleccion = OperacionesScanner.leerDato("Introduzca colección del comic:");

		return new Comic(fechaPublicacion, nombre, numero, coleccion);
	}

	public static Revista crearRevista() {
		LocalDate fechaPublicacion = OperacionesScanner.leerFechaPublicacion();
		String nombre = OperacionesScanner.leerDato("Introduzca nombre de la revista:");
		int numero = OperacionesScanner.leerNumeroEnteroInt("Introduzca número de la revista:");
		String periocidad = OperacionesScanner.leerDato("Introduzca periocidad de la revista:");

		return new Revista(fechaPublicacion, nombre, numero, periocidad);
	}

	public static Multimedia crearDisco() {
		int codigo = OperacionesScanner.leerNumeroEnteroInt("Introduzca código del disco:");
		LocalDate fechaPublicacion = OperacionesScanner.leerFechaPublicacion();
		String titulo = OperacionesScanner.leerDato("Introduzca título del disco:");
		LocalTime duracion = OperacionesScanner.leerDuracion();
		String formatoString = OperacionesScanner
				.leerDato("Introduzca formato del disco (CD-ROM, CD-R, CD-RW ó CD-DA):");
		Formato formato = Formato.CDROM;
		if (formatoString.equalsIgnoreCase("CD-R")) {
			formato = Formato.CDR;
		} else if (formatoString.equalsIgnoreCase("CD-RW")) {
			formato = Formato.CDRW;
		} else if (formatoString.equalsIgnoreCase("CD-DA")) {
			formato = Formato.CDDA;
		}

		return new Disco(codigo, fechaPublicacion, titulo, duracion, formato);
	}

	public static void modificarLibro(Libro libro) {
		int opcion = 0;
		do {
			Menu.menuModificarLibro();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				libro.setFechaPublicacion(OperacionesScanner.leerFechaPublicacion());
				break;
			case 2:
				libro.setNombre(OperacionesScanner.leerDato());
				break;
			case 3:
				libro.setEdicion(OperacionesScanner.leerDato());
				break;
			case 4:
				libro.setIsbn(OperacionesScanner.leerDato());
				break;
			case 5:
				libro.setAutor(OperacionesScanner.leerDato());
				break;
			case 6:
				try {
					if (libro.isPrestado()) {
						libro.devolver();
					} else {
						libro.prestar();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 6);
	}

	public static void modificarComic(Comic comic) {
		int opcion = 0;
		do {
			Menu.menuModificarComic();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				comic.setFechaPublicacion(OperacionesScanner.leerFechaPublicacion());
				break;
			case 2:
				comic.setNombre(OperacionesScanner.leerDato());
				break;
			case 3:
				comic.setNumero(OperacionesScanner.leerNumeroEnteroInt());
				break;
			case 4:
				comic.setColeccion(OperacionesScanner.leerDato());
				break;
			case 5:
				try {
					if (comic.isPrestado()) {
						comic.devolver();
					} else {
						comic.prestar();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 5);
	}

	public static void modificarRevista(Revista revista) {
		int opcion = 0;
		do {
			Menu.menuModificarRevista();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				revista.setFechaPublicacion(OperacionesScanner.leerFechaPublicacion());
				break;
			case 2:
				revista.setNombre(OperacionesScanner.leerDato());
				break;
			case 3:
				revista.setNumero(OperacionesScanner.leerNumeroEnteroInt());
				break;
			case 4:
				revista.setPeriocidad(OperacionesScanner.leerDato());
				break;
			case 5:
				try {
					if (revista.isPrestado()) {
						revista.devolver();
					} else {
						revista.prestar();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 5);
	}

	public static void modificarDisco(Disco disco) {
		int opcion = 0;
		do {
			Menu.menuModificarDisco();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				disco.setCodigo(OperacionesScanner.leerNumeroEnteroInt());
				break;
			case 2:
				disco.setFechaPublicacion(OperacionesScanner.leerFechaPublicacion());
				break;
			case 3:
				disco.setTitulo(OperacionesScanner.leerDato());
				break;
			case 4:
				disco.setDuracion(OperacionesScanner.leerDuracion());
				break;
			case 5:
				Formato formato = disco.getFormato();
				String formatoString = OperacionesScanner
						.leerDato("Introduzca formato del disco (CD-ROM, CD-R, CD-RW ó CD-DA):");
				if (formatoString.equalsIgnoreCase("CD-ROM")) {
					formato = Formato.CDROM;
				} else if (formatoString.equalsIgnoreCase("CD-R")) {
					formato = Formato.CDR;
				} else if (formatoString.equalsIgnoreCase("CD-RW")) {
					formato = Formato.CDRW;
				} else if (formatoString.equalsIgnoreCase("CD-DA")) {
					formato = Formato.CDDA;
				}
				disco.setFormato(formato);
				break;
			case 6:
				try {
					if (disco.isPrestado()) {
						disco.devolver();
					} else {
						disco.prestar();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 5);
	}

	public static int cantidadUnidades() {
		int resultado = 0;
		int opcion = 0;
		do {
			Menu.menuNumeroProducto();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				resultado = Libro.getCantidadUnidades();
				break;
			case 2:
				resultado = Comic.getCantidadUnidades();
				break;
			case 3:
				resultado = Revista.getCantidadUnidades();
				break;
			case 4:
				resultado = Disco.getCantidadUnidades();
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 4);

		return resultado;
	}

}
