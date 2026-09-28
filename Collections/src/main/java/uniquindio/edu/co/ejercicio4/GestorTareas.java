package uniquindio.edu.co.ejercicio4;

import java.util.PriorityQueue;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 4
 */

public class GestorTareas {

    private PriorityQueue<Tarea> tareas;

    public GestorTareas() {
        tareas = new PriorityQueue<>(new ComparadorPrioridad());
    }

    public boolean agregarTarea(Tarea tarea) {
       return tareas.add(tarea);
    }

    public Tarea atenderTarea(){
        return tareas.poll();
    }

    public Tarea verProximaTarea(){
        return tareas.peek();
    }

    public void mostrarTareas(){
        for(Tarea tarea : tareas){
            System.out.println(tarea);
        }
    }
}
