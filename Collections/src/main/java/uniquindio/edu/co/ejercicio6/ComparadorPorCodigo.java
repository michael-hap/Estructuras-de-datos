package uniquindio.edu.co.ejercicio6;

import java.util.Comparator;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 6
 */

public class ComparadorPorCodigo implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getCodigo().compareTo(p2.getCodigo());
    }

}
