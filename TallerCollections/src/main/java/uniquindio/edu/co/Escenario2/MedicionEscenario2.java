package uniquindio.edu.co.Escenario2;

public class MedicionEscenario2 {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        // Calentamiento inicial de la JVM
        PlataformaVentas calentamiento = new PlataformaVentas();

        for (int i = 0; i < 1000; i++) {
            calentamiento.insertarProducto(
                    new Producto("W" + i, "Producto " + i,
                            i + 1000, "General")
            );
        }

        for (int cantidad : tamanios) {

            PlataformaVentas plataforma = new PlataformaVentas();

            Runtime runtime = Runtime.getRuntime();

            System.gc();

            long memoriaAntes = runtime.totalMemory()
                    - runtime.freeMemory();

            long inicio = System.nanoTime();

            // Insertar productos en todas las colecciones
            for (int i = 0; i < cantidad; i++) {

                Producto producto = new Producto(
                        "P" + i,
                        "Producto " + i,
                        (i % 5000) + 1000,
                        "Categoria " + (i % 10)
                );

                plataforma.insertarProducto(producto);
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
            System.out.println("Productos registrados: "
                    + plataforma.cantidadProductos());
        }
    }
}
