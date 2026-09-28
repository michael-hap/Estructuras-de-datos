package uniquindio.edu.co.ejercicio6;

import java.util.Comparator;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 6
 */

public class ComparadorPorNombre implements Comparator<Producto> {
    @Override
    public int compare(Producto producto1, Producto producto2) {
        return producto1.getNombre().compareTo(producto2.getNombre());
    }
}
