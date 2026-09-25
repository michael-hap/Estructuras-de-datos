package uniquindio.edu.co.ejercicio4;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Tarea tarea1 = new Tarea("Lavar banio",2);
        Tarea tarea2 = new Tarea("Entregar proyecto", 1);
        Tarea tarea3 = new Tarea("Mirar videos", 3);


        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea3);
        gestor.agregarTarea(tarea2);

        gestor.mostrarTareas();

        IO.println("Atendiendo la tarea con mayor prioridad");
        System.out.println(gestor.atenderTarea());

        IO.println("Listado de tareas actualizado");
        gestor.mostrarTareas();

        IO.println("Mirando proxima tarea");
        System.out.println(gestor.verProximaTarea());
    }
}
