package uniquindio.edu.co.ListaSimplementeEnlazada.Ejercicio2;

public class ListaSimple {
    private Nodo inicio, fin;

    public ListaSimple(){
        inicio= null;
        fin= null;
    }

    public void agregarInicio(int elemento){
        inicio = new Nodo(elemento, inicio);

        if(fin==null){
            fin=inicio;
        }
    }

    public void agregarFin(int elemento){
        if(inicio==null){
            inicio = fin = new Nodo(elemento);
        }else{
            fin.siguiente= new Nodo(elemento);
            fin= fin.siguiente;
        }
    }

    public void invertirLista(){
        Nodo actual= inicio;
        Nodo anterior= null;
        Nodo siguiente;
        if(inicio== null){
            inicio=fin=null;
        }else{
            while(actual != null){
                siguiente= actual.siguiente;
                actual.siguiente=anterior;
                anterior=actual;
                actual=siguiente;
            }
            fin=inicio;
            inicio=anterior;
        }
    }

    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print(" [ " + recorrer.dato + " ] --->" );
            recorrer= recorrer.siguiente;
        }
    }


}
