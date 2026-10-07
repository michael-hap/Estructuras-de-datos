package uniquindio.edu.co.ListaSimplementeEnlazada.Ejercicio3;

public class Nodo {
    public int dato;
    public Nodo siguiente;

    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }

    public Nodo(int d, Nodo nodo){
        dato=d;
        siguiente=nodo;
    }

}
