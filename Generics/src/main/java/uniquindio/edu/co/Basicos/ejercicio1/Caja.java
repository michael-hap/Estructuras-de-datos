package uniquindio.edu.co.Basicos.ejercicio1;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 1 de la sección Básicos
 */


public class Caja<T> {
    private T contenido;

    public void guardar(T valor){
        this.contenido = valor;

    }

    public T obtener(){
        return contenido;
    }
}
