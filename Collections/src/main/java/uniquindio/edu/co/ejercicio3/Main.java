package uniquindio.edu.co.ejercicio3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[]args){
        Set<String> nombres = new TreeSet<>();
        Set<String> apellidos = new TreeSet<>();
        nombres.add("Jose");
        nombres.add("Paula");
        nombres.add("Michael");
        apellidos.add("García");
        apellidos.add("Celemino");
        apellidos.add("Arteaga");

        Iterator<String> iterador = nombres.iterator();
        Iterator<String>iterador2 = apellidos.iterator();
        while(iterador.hasNext() && iterador2.hasNext()){
            System.out.println(iterador.next() + " " + iterador2.next());
        }
    }
}