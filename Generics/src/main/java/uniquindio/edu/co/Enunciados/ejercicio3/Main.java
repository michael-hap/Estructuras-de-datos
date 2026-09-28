package uniquindio.edu.co.Enunciados.ejercicio3;

import java.util.Arrays;

/*
    Este ejercicio corresponde al taller de Generics, es el ejercicio 3 de la sección Enunciados
 */


public class Main {
    public static void main(String[] args) {
        CatalogoCursos catalogo = new CatalogoCursos();

        Curso curso1= new Curso("Matemáticas", "01", 2005);
        Curso curso2= new Curso("Español", "02", 2007);
        Curso curso3= new Curso("Programación", "03", 2020);

        catalogo.agregarCursos(curso1);
        catalogo.agregarCursos(curso2);
        catalogo.agregarCursos(curso3);

        System.out.println("Cursos del 2007: ");
        System.out.println(catalogo.buscarPorAnio(2007));

        System.out.println("Catalogo ordenado por cursos: ");
        catalogo.ordenarPorCodigo();
        System.out.println(catalogo.cursos);
    }
}
