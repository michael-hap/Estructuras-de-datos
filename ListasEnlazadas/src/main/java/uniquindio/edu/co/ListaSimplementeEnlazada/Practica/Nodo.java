package uniquindio.edu.co.ListaSimplementeEnlazada.Practica;

public class Nodo {
    public int dato;
    public Nodo siguiente; //Puntero enlace

    //Constructor para insertar al Final
    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }

    //Constructor para insertar al Inicio

    public Nodo(int d, Nodo nodo){
        dato=d;
        siguiente=nodo;
    }
}
