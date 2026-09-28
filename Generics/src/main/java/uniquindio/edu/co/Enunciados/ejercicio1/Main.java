package uniquindio.edu.co.Enunciados.ejercicio1;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 1 de la sección Enunciados
 */


public class Main {
    public static void main(String[] args) {
        InventarioCaja<Integer> inventario = new InventarioCaja<>();
         inventario.agregar(15);
         inventario.agregar(17);
         inventario.agregar(18);
         inventario.agregar(19);

        System.out.println(inventario.mayoresQue(16));

    }

}
