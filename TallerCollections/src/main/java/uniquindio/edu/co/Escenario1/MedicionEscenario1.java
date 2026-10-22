
package uniquindio.edu.co.Escenario1;

public class MedicionEscenario1 {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        for (int cantidad : tamanios) {

            RegistroPacientes registro = new RegistroPacientes();

            Runtime runtime = Runtime.getRuntime();

            System.gc();

            long memoriaAntes = runtime.totalMemory()
                    - runtime.freeMemory();

            long inicio = System.nanoTime();

            // Registrar pacientes
            for (int i = 0; i < cantidad; i++) {
                Paciente paciente = new Paciente(
                        String.valueOf(i),
                        "Paciente " + i
                );

                registro.registrarPaciente(paciente);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory()
                    - runtime.freeMemory();

            // Convertir nanosegundos a milisegundos
            double tiempo = (fin - inicio) / 1_000_000.0;

            // Convertir bytes a KB
            long memoria = Math.max(0,
                    memoriaDespues - memoriaAntes) / 1024;

            System.out.println("--------------------------");
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Tiempo (ms): " + tiempo);
            System.out.println("Memoria aproximada (KB): " + memoria);
        }
    }
}
