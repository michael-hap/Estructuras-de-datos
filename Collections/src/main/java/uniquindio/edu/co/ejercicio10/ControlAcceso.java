package uniquindio.edu.co.ejercicio10;

import java.util.HashSet;
import java.util.Iterator;

public class ControlAcceso {
    private HashSet<String> empleados;

    public ControlAcceso(){
        empleados = new HashSet<>();
    }

    public boolean registrarEmpleado(String codigo){
        return empleados.add(codigo);
    }

    public boolean verificarEmpleado(String codigo){
       return empleados.contains(codigo);
    }

    public void mostrarEmpleados(){
        for(String empleado : empleados){
            IO.println(empleado);
        }
    }

    public void mostrarEmpleados2(){
        Iterator<String> iterador = empleados.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
