package uniquindio.edu.co.ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;

public class Empresa {
    private ArrayList<Producto> inventario;

    public Empresa(){
        inventario = new ArrayList<>();

    }

    public boolean agregarProducto(Producto producto){
        if(buscarProducto(producto.getCodigo())== null){
            return inventario.add(producto);
        }
        return false;
    }

    public void mostrarProductos(){
        for(int i=0; i<inventario.size(); i++){
            System.out.println(inventario.get(i));
        }
    }

    public Producto buscarProducto(String codigoProducto){
        for(Producto producto: inventario){
            if(producto.getCodigo().equals(codigoProducto)){
                return producto;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String codigoProducto){
       Producto producto = buscarProducto(codigoProducto);

       if(producto != null){
           return inventario.remove(producto); //Devuelve un booleano el .remove()

       }
       return false;
    }

    public void ordenarPorNombre(){
        inventario.sort(new ComparadorPorNombre());
    }

    public void ordenarPorCodigo(){
        inventario.sort(new ComparadorPorCodigo());
    }

    public void ordenarPorPrecio(){
        inventario.sort(new ComparadorPorPrecio());
    }
}
