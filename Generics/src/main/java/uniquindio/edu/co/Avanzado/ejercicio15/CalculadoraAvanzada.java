package uniquindio.edu.co.Avanzado.ejercicio15;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 15 de la sección Avanzado
 */



public class CalculadoraAvanzada<T extends Number &  Comparable<T>> {
    public static void main(String[] args) {
        CalculadoraAvanzada<Integer> calculadora = new CalculadoraAvanzada<>();
        System.out.println("suma = " + calculadora.sumarCalculadora(8,7));
        System.out.println("resta= " + calculadora.restar(7,8));
        System.out.println("máximo= " + calculadora.maximo(7,8));
        System.out.println("mínimo= " + calculadora.minimo(7,8));



    }

    public double sumarCalculadora(T valor1, T valor2){
        return valor1.doubleValue()+ valor2.doubleValue();
    }

    public double restar(T valor1, T valor2){
        return valor1.doubleValue()- valor2.doubleValue();
    }

    public T maximo(T valor1, T valor2){
        if (valor1.compareTo(valor2) > 0){
            return valor1;
        };
        return valor2;
    }

    public T minimo(T valor1, T valor2){
        if (valor1.compareTo(valor2) < 0){
            return valor1;
        }
        return valor2;
    }
}
