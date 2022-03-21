package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import gui.Menu;
import lombok.Data;
import model.Libro;
import model.Multimedia;
import model.ProductoPrestable;
import model.Revista;
import model.Comic;
import model.Disco;
import model.ExceptionPrestado;
import tools.OperacionesScanner;

@Data
public class ListaProductosPrestables implements IListaProductosPrestables {

	List<ProductoPrestable> listaProductos = new ArrayList<>();

	@Override
	public boolean addProducto(ProductoPrestable p) {
		boolean resultado = listaProductos.add(p);
		return resultado;
	}

	public ProductoPrestable buscarProducto() throws ExceptionPrestado {
		ProductoPrestable producto = null;

		int opcion = 0;
		do {
			Menu.menuTipoProducto();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");

			switch (opcion) {
			case 1:
				producto = this.buscarLibro();
				break;
			case 2:
				producto = this.buscarComic();
				break;
			case 3:
				producto = this.buscarRevista();
				break;
			case 4:
				producto = this.buscarDisco();
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 4);

		return producto;
	}

	public Libro buscarLibro() throws ExceptionPrestado {
		Libro libro = null;

		String autorClavePrimaria = OperacionesScanner.leerDato("Introduzca nombre autor:");

		for (ProductoPrestable item : listaProductos) {
			if (item instanceof Libro) {
				Libro itemLibro = (Libro) item;
				if (autorClavePrimaria.equalsIgnoreCase(itemLibro.getAutor())) {
					libro = (Libro) item;
					break;
				}
			}
		}

		Optional<Libro> optional = Optional.of(libro);
		if (optional.isEmpty()) {
			throw new ExceptionPrestado("Libro no encontrado.");
		}

		return libro;
	}

	public Comic buscarComic() throws ExceptionPrestado {
		Comic comic = null;

		int numeroClavePrimaria = OperacionesScanner.leerNumeroEnteroInt("Introduzca número cómic:");

		for (ProductoPrestable item : listaProductos) {
			if (item instanceof Comic) {
				Comic itemComic = (Comic) item;
				if (numeroClavePrimaria == itemComic.getNumero()) {
					comic = (Comic) item;
					break;
				}
			}
		}

		Optional<Comic> optional = Optional.of(comic);
		if (optional.isEmpty()) {
			throw new ExceptionPrestado("Cómic no encontrado.");
		}

		return comic;
	}

	public Revista buscarRevista() throws ExceptionPrestado {
		Revista revista = null;

		int numeroClavePrimaria = OperacionesScanner.leerNumeroEnteroInt("Introduzca número revista:");

		for (ProductoPrestable item : listaProductos) {
			if (item instanceof Revista) {
				Revista itemRevista = (Revista) item;
				if (numeroClavePrimaria == itemRevista.getNumero()) {
					revista = (Revista) item;
					break;
				}
			}
		}

		Optional<Revista> optional = Optional.of(revista);
		if (optional.isEmpty()) {
			throw new ExceptionPrestado("Cómic no encontrado.");
		}

		return revista;
	}

	public Multimedia buscarDisco() throws ExceptionPrestado {
		Multimedia disco = null;

		int codigoClavePrimaria = OperacionesScanner.leerNumeroEnteroInt("Introduzca número revista:");

		for (ProductoPrestable item : listaProductos) {
			if (item instanceof Disco) {
				Multimedia itemDisco = (Disco) item;
				if (codigoClavePrimaria == itemDisco.getCodigo()) {
					disco = (Disco) item;
					break;
				}
			}
		}

		Optional<Multimedia> optional = Optional.of(disco);
		if (optional.isEmpty()) {
			throw new ExceptionPrestado("Disco no encontrado.");
		}

		return disco;
	}

	@Override
	public boolean removeProducto(ProductoPrestable p) {
		boolean resultado = listaProductos.remove(p);
		return resultado;
	}

	@Override
	public ProductoPrestable updateProducto(ProductoPrestable p) {
		if (p instanceof Libro) {
			OperacionesProducto.modificarLibro((Libro) p);
		} else if (p instanceof Comic) {
			OperacionesProducto.modificarComic((Comic) p);
		} else if (p instanceof Revista) {
			OperacionesProducto.modificarRevista((Revista) p);
		} else if (p instanceof Disco) {
			OperacionesProducto.modificarDisco((Disco) p);
		}

		return p;
	}

	@Override
	public List<ProductoPrestable> generarListadoProductos() {
		List<ProductoPrestable> listado = new ArrayList<>();

		int opcion = 0;
		do {
			Menu.menuListados();
			opcion = OperacionesScanner.leerNumeroEnteroInt("Introduzca opción (numérica):");
			boolean prestado;

			switch (opcion) {
			case 1:
				listado = this.informePublicacionesAnterioresFecha(OperacionesScanner.leerFechaPublicacion());
				break;
			case 2:
				prestado = OperacionesScanner.leerDatoBooleano("Informe libros prestados (S) o no prestados (N):");
				listado = this.informeListadoLibros(prestado);
				break;
			case 3:
				prestado = OperacionesScanner.leerDatoBooleano("Informe libros prestados (S) o no prestados (N):");
				listado = this.informeListadoComics(prestado);
				break;
			case 4:
				prestado = OperacionesScanner.leerDatoBooleano("Informe libros prestados (S) o no prestados (N):");
				listado = this.informeListadoRevistas(prestado);
				break;
			case 5:
				prestado = OperacionesScanner.leerDatoBooleano("Informe libros prestados (S) o no prestados (N):");
				listado = this.informeListadoDiscosMultimedia(prestado);
				break;
			case 6:
				listado = this.informeListadoCompleto();
				break;
			default:
				System.out.println("Opción numérica incorrecta.");
			}
		} while (opcion < 1 || opcion > 6);
		return listado;
	}
	
	public List<ProductoPrestable> informePublicacionesAnterioresFecha(LocalDate fecha) {
		List<ProductoPrestable> listado = new ArrayList<>();
		
		for(ProductoPrestable item: this.getListaProductos()) {
			if(item.getFechaPublicacion().isBefore(fecha)) {
				listado.add(item);
			}
		}
		
		return listado;
	}
	
	public List<ProductoPrestable> informeListadoLibros(boolean prestado) {
		List<ProductoPrestable> listado = new ArrayList<>();
		
		for(ProductoPrestable item: this.getListaProductos()) {
			if(item instanceof Libro) {
				if(((Libro) item).isPrestado() == prestado) {
					listado.add(item);
				}
			}
		}
		
		return listado;
	}
	
	public List<ProductoPrestable> informeListadoComics(boolean prestado) {
		List<ProductoPrestable> listado = new ArrayList<>();

		for(ProductoPrestable item: this.getListaProductos()) {
			if(item instanceof Comic) {
				if(((Comic) item).isPrestado() == prestado) {
					listado.add(item);
				}
			}
		}
		
		return listado;
	}
	
	public List<ProductoPrestable> informeListadoRevistas(boolean prestado) {
		List<ProductoPrestable> listado = new ArrayList<>();
	
		for(ProductoPrestable item: this.getListaProductos()) {
			if(item instanceof Revista) {
				if(((Revista) item).isPrestado() == prestado) {
					listado.add(item);
				}
			}
		}
		
		return listado;
	}
	
	public List<ProductoPrestable> informeListadoDiscosMultimedia(boolean prestado) {
		List<ProductoPrestable> listado = new ArrayList<>();
	
		for(ProductoPrestable item: this.getListaProductos()) {
			if(item instanceof Disco) {
				if(((Disco) item).isPrestado() == prestado) {
					listado.add(item);
				}
			}
		}
		
		return listado;
	}
	
	public List<ProductoPrestable> informeListadoCompleto() {
		List<ProductoPrestable> listado = new ArrayList<>();
		
		for(ProductoPrestable item: this.getListaProductos()) {
			listado.add(item);
		}
		
		return listado;
	}

	@Override
	public void imprimirListado(List<ProductoPrestable> lista) {
		for(ProductoPrestable item: lista) {
			System.out.println(item.toString());
		}
	}

}
