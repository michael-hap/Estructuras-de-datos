package uniquindio.edu.co.ejercicio9;

import java.util.Stack;

/*
    Este ejercicio corresponde al taller de collections, es el ejercicio 9
 */

public class Navegador {

    private Stack<String> historial;

    public Navegador(){
        historial = new Stack<>();
    }

    public void visitarPagina(String pagina){
        historial.push(pagina);
    }

    public String retroceder(){
        if(historial.size()<=1){
            return "No hay más páginas anteriores";
        }
        historial.pop();
        return historial.peek();

    }

    public String paginaActual(){
        if(historial.isEmpty()){
            return "No hay historial de páginas actuales";
        }else{
            return historial.peek();
        }
    }

    public String mostrarHistorial(){
        return historial.toString();
    }

}
