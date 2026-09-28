package uniquindio.edu.co.ejercicio7;

import java.util.*;
/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 7
 */


public class Banco {
    private LinkedList<String> clientes;

    public Banco(){
        clientes = new LinkedList<>();
    }

    public void agregarCliente(String nombre){
        clientes.addLast(nombre);
    }

    public void agregarClienteUrgente(String nombre){
        clientes.addFirst(nombre);
    }

    public String atenderCliente(){
        if (clientes.isEmpty()){
            return "No hay clientes en cola";
        }else{
            return clientes.removeFirst();
        }
    }

    public void mostrarClientes(){
        for(String cliente: clientes){
            System.out.println(cliente);
        }
    }

}
