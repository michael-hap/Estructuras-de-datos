package uniquindio.edu.co.Escenario3;

public class MedicionEscenario3 {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        // Calentamiento básico de la JVM
        PlataformaTaxis calentamiento = new PlataformaTaxis();

        for (int i = 0; i < 1000; i++) {
            calentamiento.registrarSolicitud(
                    new SolicitudTaxi(
                            "W" + i, "Usuario " + i,
                            "Origen", "Destino"
                    )
            );
        }

        for (int cantidad : tamanios) {

            PlataformaTaxis plataforma = new PlataformaTaxis();
            Runtime runtime = Runtime.getRuntime();

            System.gc();

            long memoriaAntes = runtime.totalMemory()
                    - runtime.freeMemory();

            long inicio = System.nanoTime();

            // Registrar solicitudes
            for (int i = 0; i < cantidad; i++) {

                SolicitudTaxi solicitud = new SolicitudTaxi(
                        "S" + i,
                        "Usuario " + i,
                        "Origen " + (i % 10),
                        "Destino " + (i % 10)
                );

                plataforma.registrarSolicitud(solicitud);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory()
                    - runtime.freeMemory();

            double tiempo = (fin - inicio) / 1_000_000.0;

            long memoria = Math.max(0,
                    memoriaDespues - memoriaAntes) / 1024;

            System.out.println("--------------------------");
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Tiempo (ms): " + tiempo);
            System.out.println("Memoria aproximada (KB): " + memoria);
            System.out.println("Solicitudes registradas: "
                    + plataforma.cantidadSolicitudes());
        }
    }
}
