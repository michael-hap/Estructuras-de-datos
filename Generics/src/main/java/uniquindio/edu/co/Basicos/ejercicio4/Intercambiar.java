package uniquindio.edu.co.Basicos.ejercicio4;

import java.util.Arrays;

public class Intercambiar {

    public static void main(String[] args) {
        String[] nombres= {"Ana", "Camilo", "Carlos", "Michael"};

        intercambiar(nombres,1,3);
        System.out.println(Arrays.toString(nombres));
    }
    public static <T> void intercambiar(T[] arreglo, int i, int j){
        T temporal = arreglo[i];
        arreglo[i]= arreglo[j];
        arreglo[j]= temporal;
    }
}
