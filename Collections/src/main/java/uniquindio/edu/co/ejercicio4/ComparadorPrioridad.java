package uniquindio.edu.co.ejercicio4;

import java.util.Comparator;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 4
 */

public class ComparadorPrioridad implements Comparator<Tarea> {

    @Override
    public int compare(Tarea t1, Tarea t2) {
        return Integer.compare(t1.getPrioridad(), t2.getPrioridad());
    }
}
