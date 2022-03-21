package datos;

import java.util.List;

import model.ExceptionPrestado;
import model.ProductoPrestable;
import model.Revista;

public interface IListaProductosPrestables {
	boolean addProducto(ProductoPrestable p);
	ProductoPrestable buscarProducto() throws ExceptionPrestado;
	boolean removeProducto(ProductoPrestable p);
	ProductoPrestable updateProducto(ProductoPrestable p);
	List<ProductoPrestable> generarListadoProductos();
	void imprimirListado(List<ProductoPrestable> lista);
}
