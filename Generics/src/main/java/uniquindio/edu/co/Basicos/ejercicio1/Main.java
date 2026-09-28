package uniquindio.edu.co.Basicos.ejercicio1;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 1 de la sección Básicos
 */


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
