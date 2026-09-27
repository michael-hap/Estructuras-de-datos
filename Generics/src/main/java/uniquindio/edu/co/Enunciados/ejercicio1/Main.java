package uniquindio.edu.co.Enunciados.ejercicio1;

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
