package uniquindio.edu.co.ListaSimplementeEnlazada.Practica;

public class Lista {
    private Nodo inicio, fin;  //Punteros para saber donde está el inicio y el fin

    public Lista(){
        inicio= null;
        fin= null;
    }

    //Metodo para agregar un nodo al inicio de la lista

    public void agregarInicio(int elemento){
        //Creando el nodo
        inicio = new Nodo(elemento,inicio);

        if(fin==null){
            fin = inicio;
        }
    }

    //Metodo para agregar un nodo al final de la lista

    public void agregarFin(int elemento){
        if(inicio==null){
            inicio=fin=new Nodo(elemento);
        }else{
            fin.siguiente= new Nodo(elemento);
            fin = fin.siguiente;
        }
    }

    //Metodo para eliminar del inicio

    /* Inicialmente lo había hecho así
        public void eliminarInicio(){

            if(inicio==null){
                inicio=fin=null;
            }else{
                inicio= inicio.siguiente;
        }

    }

     */
    public int eliminarInicio(){
        int elemento = inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio= inicio.siguiente;
        }
        return elemento;
    }

    //Metodo para eliminar del final

    public int eliminarFin(){
        int elemento= fin.dato;
        if(inicio==fin){
            inicio=fin= null;
        }else {
            Nodo temporal = inicio;
            while(temporal.siguiente!=fin){
                temporal= temporal.siguiente;
            }
            fin= temporal;
            fin.siguiente= null;
        }
        return elemento;
    }

    //Metodo para eliminar un nodo en especifico

    public boolean eliminarNodo(int elemento){
        if(inicio != null){
            if(inicio==fin && inicio.dato==elemento){
                inicio=fin=null;
            }else if(elemento== inicio.dato){
                inicio = inicio.siguiente;
            }else{
                Nodo anterior= inicio;
                Nodo temporal= inicio.siguiente;
                while(temporal!= null && temporal.dato!=elemento){
                    anterior= temporal;
                    temporal= temporal.siguiente;
                }
                if(temporal!=null){
                    anterior.siguiente= temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
            return true;
        }
        return false;
    }
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("[" + recorrer.dato + "]---->");
            recorrer= recorrer.siguiente;
        }
    }
}
