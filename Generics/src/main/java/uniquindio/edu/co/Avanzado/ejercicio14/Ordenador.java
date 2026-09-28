package uniquindio.edu.co.Avanzado.ejercicio14;

import java.util.ArrayList;
import java.util.List;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 14 de la sección Avanzado
 */


public class Ordenador<T extends Comparable<T>>{
    public static void main(String[] args) {

        List<Integer> numeros= new ArrayList<Integer>();

        numeros.add(6);
        numeros.add(3);
        numeros.add(4);
        numeros.add(8);
        numeros.add(1);
        numeros.add(15);

        Ordenador<Integer> ordenador = new Ordenador<>();
        ordenador.ordenar(numeros);
        System.out.println(numeros);
    }

    public void ordenar(List<T> lista){
        for (int i = 0; i<lista.size()-1; i ++){
            for (int j= 0; j<lista.size()- 1 - i; j++){
                if(lista.get(j).compareTo(lista.get(j+1))>0){
                    T temporal= lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1,temporal);
                }
            }
        }
    }
}
