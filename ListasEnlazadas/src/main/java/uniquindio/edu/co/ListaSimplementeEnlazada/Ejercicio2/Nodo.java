package uniquindio.edu.co.ListaSimplementeEnlazada.Ejercicio2;

public class Nodo {
    public Nodo siguiente;
    public int dato;

    public Nodo(int d){
        this.dato= d;
        this.siguiente= null;
    }

    public Nodo(int d, Nodo nodo){
        dato=d;
        siguiente= nodo;
    }

}
