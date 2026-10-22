
package uniquindio.edu.co.Escenario2;

import java.util.*;

public class PlataformaVentas {

    private HashMap<String, Producto> productos;
    private LinkedList<Producto> listaRecientes;
    private TreeSet<Producto> productosPorPrecio;
    private HashMap<String, HashSet<Producto>> productosPorCategoria;

    public PlataformaVentas() {

        productos = new HashMap<>();
        listaRecientes = new LinkedList<>();

        productosPorPrecio = new TreeSet<>(
                Comparator.comparingDouble(Producto::getPrecio)
                        .thenComparing(Producto::getCodigo)
        );

        productosPorCategoria = new HashMap<>();
    }


    public boolean insertarProducto(Producto producto) {

        if (productos.containsKey(producto.getCodigo())) {
            return false;
        }

        productos.put(producto.getCodigo(), producto);
        listaRecientes.addFirst(producto);
        productosPorPrecio.add(producto);

        productosPorCategoria
                .computeIfAbsent(
                        producto.getCategoria(),
                        k -> new HashSet<>()
                )
                .add(producto);

        return true;
    }


    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }


    public void mostrarPorPrecio() {

        for (Producto producto : productosPorPrecio) {
            System.out.println(producto);
        }
    }


    public void mostrarRecientes() {

        for (Producto producto : listaRecientes) {
            System.out.println(producto);
        }
    }


    public void filtrarPorCategoria(String categoria) {

        HashSet<Producto> encontrados =
                productosPorCategoria.get(categoria);

        if (encontrados == null || encontrados.isEmpty()) {
            System.out.println("No hay productos en esta categoría.");
            return;
        }

        for (Producto producto : encontrados) {
            System.out.println(producto);
        }
    }


    public int cantidadProductos() {
        return productos.size();
    }
}
