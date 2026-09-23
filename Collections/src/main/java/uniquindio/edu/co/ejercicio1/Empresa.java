package uniquindio.edu.co.ejercicio1;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> inventario;

    public Empresa(){
        inventario = new TreeSet<>();
    }

    public boolean agregarProducto(Producto nuevoProducto){
        return inventario.add(nuevoProducto);
    }

    public Producto buscarProducto(String codigoProducto){
        for(Producto producto: inventario){
            if(producto.getCodigo().equals(codigoProducto)){
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos(){
        for(Producto producto: inventario){
            System.out.println(producto);
        }
    }
}
