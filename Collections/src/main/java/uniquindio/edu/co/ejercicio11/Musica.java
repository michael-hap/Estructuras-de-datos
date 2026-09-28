package uniquindio.edu.co.ejercicio11;

import java.util.LinkedHashSet;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 11
 */


public class Musica {
    private LinkedHashSet<String> canciones;

    public Musica(){
        canciones = new LinkedHashSet<>();
    }

    public boolean agregarCancion(String cancion){
        return canciones.add(cancion);
    }

    public boolean eliminarCancion(String cancion){
        return canciones.remove(cancion);
    }

    public boolean esFavorita(String cancion){
        return canciones.contains(cancion);
    }

    public void mostrarCanciones(){
        for(String cancion : canciones){
            System.out.println(cancion);
        }
    }
}
