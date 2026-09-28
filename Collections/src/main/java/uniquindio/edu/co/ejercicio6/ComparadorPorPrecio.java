package uniquindio.edu.co.ejercicio6;

import java.util.Comparator;
/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 6
    se crearon comparadores de más para practicar.
 */


public class ComparadorPorPrecio implements Comparator<Producto>{

    @Override
    public int compare(Producto p1, Producto p2) {
        return Double.compare(p1.getPrecio(), p2.getPrecio());
    }
}
