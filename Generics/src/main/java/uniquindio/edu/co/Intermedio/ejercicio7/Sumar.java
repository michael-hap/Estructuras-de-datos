package uniquindio.edu.co.Intermedio.ejercicio7;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 7 de la sección Intermedio
 */


public class Sumar {

    public static void main(String[] args) {
        System.out.println(sumar(1,2));
        System.out.println(sumar(8,5));

    }


    public static <T extends Number> double sumar(T valor1, T valor2) {
        return valor1.doubleValue() + valor2.doubleValue();
    }
}
