package uniquindio.edu.co.Intermedio.ejercicio6;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 6 de la sección Intermedio
 */


public class CajaNumerica<T extends Number> {
    private T valor;
    public static void main(String[] args) {
        CajaNumerica<Integer> caja1 = new CajaNumerica<>(10);
        System.out.println(caja1.doble());

        CajaNumerica<Double> caja2 = new CajaNumerica<>(7.8);
        System.out.println(caja2.doble());

    }

    public CajaNumerica(T numero){
        this.valor = numero;
    }

    public double doble(){
        return valor.doubleValue()*2;
    }

}
