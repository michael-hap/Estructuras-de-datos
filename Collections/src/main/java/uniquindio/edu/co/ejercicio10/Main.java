package uniquindio.edu.co.ejercicio10;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 10
 */

public class Main {
    public static void main(String[] args) {
        ControlAcceso edificio = new ControlAcceso();

        edificio.registrarEmpleado("01");
        edificio.registrarEmpleado("02");
        edificio.registrarEmpleado("03");
        System.out.println("Se agregó el 02 nuevamente?: " + edificio.registrarEmpleado("02"));

        IO.println("Verificando empleado");
        System.out.println(edificio.verificarEmpleado("04"));
        IO.println("\n");

        IO.println("----------Mostrar empleados con for------------");
        edificio.mostrarEmpleados();
        IO.println("\n");
        IO.println("----------Mostrar empleados con iterador------------");
        edificio.mostrarEmpleados2();
    }
}
