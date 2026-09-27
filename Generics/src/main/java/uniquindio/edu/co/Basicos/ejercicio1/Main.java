package uniquindio.edu.co.Basicos.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Celular");

        System.out.println(cajaTexto.obtener());

        Caja<Integer> cajaNumero= new Caja<>();
        cajaNumero.guardar(10);
        System.out.println(cajaNumero.obtener());


    }
}
