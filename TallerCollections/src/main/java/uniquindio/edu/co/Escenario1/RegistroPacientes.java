
package uniquindio.edu.co.Escenario1;

import java.util.HashMap;
import java.util.LinkedList;

public class RegistroPacientes {

    private HashMap<String, Paciente> pacientes;
    private LinkedList<Paciente> fila;

    public RegistroPacientes() {
        pacientes = new HashMap<>();
        fila = new LinkedList<>();
    }

    // Registrar paciente y evitar duplicados
    public boolean registrarPaciente(Paciente paciente) {

        if (pacientes.containsKey(paciente.getDocumento())) {
            return false;
        }

        pacientes.put(paciente.getDocumento(), paciente);
        fila.addLast(paciente);

        return true;
    }

    // Buscar paciente por documento
    public Paciente buscarPaciente(String documento) {
        return pacientes.get(documento);
    }

    // Atender al primero de la fila
    public Paciente atenderPaciente() {

        if (fila.isEmpty()) {
            return null;
        }

        Paciente paciente = fila.removeFirst();
        pacientes.remove(paciente.getDocumento());

        return paciente;
    }

    // Mostrar pacientes pendientes
    public void mostrarPacientes() {

        for (Paciente paciente : fila) {
            System.out.println(paciente);
        }
    }

    // Obtener cantidad de pacientes pendientes
    public int cantidadPacientes() {
        return fila.size();
    }
}
