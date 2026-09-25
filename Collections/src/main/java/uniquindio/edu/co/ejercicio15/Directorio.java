package uniquindio.edu.co.ejercicio15;

import java.util.HashMap;
import java.util.Iterator;

public class Directorio {
    private HashMap<String, String> contactos;

    public Directorio() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String celular){
        contactos.put(nombre, celular);
    }

    public String buscarContacto(String nombre){
        if(contactos.containsKey(nombre)){
            return contactos.get(nombre);
        }
        return null;
    }

    public boolean eliminarContacto(String nombre){
        if(contactos.containsKey(nombre)){
            contactos.remove(nombre);
            return true;
        }
        return false;
    }

    public void mostrarContactos(){
        Iterator iterador = contactos.entrySet().iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
