package uniquindio.edu.co.Escenario4;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Comparator;

public class CatalogoProductos {

    private HashMap<String, ProductoCatalogo> productos;
    private TreeSet<ProductoCatalogo> productosPorPrecio;

    public CatalogoProductos() {

        productos = new HashMap<>();

        productosPorPrecio = new TreeSet<>(
                Comparator.comparingDouble(
                        ProductoCatalogo::getPrecio
                ).thenComparing(ProductoCatalogo::getCodigo)
        );
    }

    public boolean insertarProducto(ProductoCatalogo producto) {

        if (productos.containsKey(producto.getCodigo())) {
            return false;
        }

        productos.put(producto.getCodigo(), producto);
        productosPorPrecio.add(producto);

        return true;
    }

    public ProductoCatalogo buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    public void mostrarPorPrecio() {

        if (productosPorPrecio.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }

        for (ProductoCatalogo producto : productosPorPrecio) {
            System.out.println(producto);
        }
    }

    public int cantidadProductos() {
        return productos.size();
    }
}
