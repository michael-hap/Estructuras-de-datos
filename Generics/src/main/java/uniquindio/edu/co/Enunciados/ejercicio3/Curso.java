package uniquindio.edu.co.Enunciados.ejercicio3;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 3 de la sección Enunciados
 */


public class Curso {
    private String nombre, codigo;
    private int anio;

    public Curso(String nombre, String codigo, int anio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.anio = anio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + anio;
    }


}
