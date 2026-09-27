package uniquindio.edu.co.Enunciados.ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CatalogoCursos {

    public ArrayList<Curso> cursos;

    public CatalogoCursos(){
        cursos = new ArrayList<>();
    }

    public void agregarCursos(Curso curso){
        cursos.add(curso);
    }

    public List<Curso> buscarPorAnio(int anioBuscar) {

        List<Curso> resultado = new ArrayList<>();

        Iterator<Curso> iterador = cursos.iterator();

        while (iterador.hasNext()) {

            Curso curso = iterador.next();

            if (curso.getAnio() == anioBuscar) {
                resultado.add(curso);
            }
        }

        return resultado;
    }

    public void ordenarPorCodigo(){
        Comparator<Curso> comparadorPorCodigo = (curso1, curso2) -> curso1.getCodigo().compareTo(curso2.getCodigo());
        cursos.sort(comparadorPorCodigo);
    }
}
