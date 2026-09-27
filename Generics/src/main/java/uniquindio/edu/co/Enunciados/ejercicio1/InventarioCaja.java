package uniquindio.edu.co.Enunciados.ejercicio1;

import java.util.*;

public class InventarioCaja<T extends Comparable<T>> {

    private ArrayList<T> elementos;

    public InventarioCaja(){
        elementos = new ArrayList();
    }

    public void agregar(T elemento){
        elementos.add(elemento);
    }

    public List<T> mayoresQue(T umbral){
        List<T> resultado = new ArrayList();

        Iterator<T> iterador = elementos.iterator();
        while(iterador.hasNext()){
            T elemento = iterador.next();
            if(elemento.compareTo(umbral) > 0){
                resultado.add(elemento);
            }
        }
        return resultado;
    }
}
