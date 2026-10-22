
package uniquindio.edu.co.Escenario1;

public class PruebaEscenario1 {

    public static void main(String[] args) {

        RegistroPacientes registro = new RegistroPacientes();

        // Registrar pacientes
        registro.registrarPaciente(new Paciente("101", "Ana"));
        registro.registrarPaciente(new Paciente("102", "Carlos"));
        registro.registrarPaciente(new Paciente("103", "Laura"));

        // Probar paciente duplicado
        boolean registrado = registro.registrarPaciente(
                new Paciente("101", "Pedro")
        );

        System.out.println("Duplicado registrado: " + registrado);

        // Mostrar fila
        System.out.println("\nPacientes pendientes:");
        registro.mostrarPacientes();

        // Buscar paciente
        System.out.println("\nBuscar documento 102:");
        System.out.println(registro.buscarPaciente("102"));

        // Atender paciente
        System.out.println("\nPaciente atendido:");
        System.out.println(registro.atenderPaciente());

        // Mostrar fila actualizada
        System.out.println("\nFila actualizada:");
        registro.mostrarPacientes();

        System.out.println("\nCantidad de pacientes: "
                + registro.cantidadPacientes());
    }
}
