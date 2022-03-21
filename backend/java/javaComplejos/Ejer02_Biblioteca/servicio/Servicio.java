package servicio;

import java.util.List;

import datos.IListaProductosPrestables;
import datos.ListaProductosPrestables;
import datos.OperacionesProducto;
import gui.Menu;
import lombok.Data;
import model.ExceptionPrestado;
import model.ProductoPrestable;
import model.Revista;
import tools.OperacionesScanner;

@Data
public class Servicio implements IServicio {

	private IListaProductosPrestables listaProductos = new ListaProductosPrestables();

	@Override
	public void addProducto() {
		ProductoPrestable producto = OperacionesProducto.crearPoducto();
		listaProductos.addProducto(producto);
	}

	@Override
	public void removeProducto() {
		ProductoPrestable producto;
		try {
			producto = listaProductos.buscarProducto();
			listaProductos.removeProducto(producto);
		} catch (ExceptionPrestado e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateProducto() {
		ProductoPrestable producto;
		try {
			producto = listaProductos.buscarProducto();
			listaProductos.updateProducto(producto);
		} catch (ExceptionPrestado e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void numeroProducto() {
		System.out.println(OperacionesProducto.cantidadUnidades());
	}

	@Override
	public void generarListado() {
		List<ProductoPrestable> listado = listaProductos.generarListadoProductos();
		listaProductos.imprimirListado(listado);
	}

}
