package uniquindio.edu.co.ListaSimplementeEnlazada.Ejercicio3;

public class ListaSimple {
    private Nodo inicio, fin;

    public ListaSimple(){
        inicio= null;
        fin= null;
    }

    public void agregarInicio(int elemento){
        inicio = new Nodo(elemento, inicio);
        if(fin==null){
            fin= inicio;
        }
    }

    public void agregarFin(int elemento){
        if(inicio==null){
            inicio = fin = new Nodo(elemento);
        }else{
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        }
    }



    public void eliminarDuplicados(){
        if(inicio==null){
            fin = null;
        }else{
            Nodo actual = inicio;

            while(actual!=null){
                Nodo anteriorComparador= actual;
                Nodo comparador= actual.siguiente;
                while(comparador!=null){
                    if(actual.dato==comparador.dato){
                        anteriorComparador.siguiente= comparador.siguiente;
                        comparador= anteriorComparador.siguiente;
                    }else{
                        anteriorComparador=anteriorComparador.siguiente;
                        comparador=comparador.siguiente;
                    }
                }
                actual=actual.siguiente;
            }
        }
    }

    public void mostrarLista(){
        Nodo recorrer= inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print(" [ " + recorrer.dato + " ]--->" );
            recorrer=recorrer.siguiente;
        }
    }
}
