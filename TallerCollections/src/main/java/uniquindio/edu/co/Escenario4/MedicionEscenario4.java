package uniquindio.edu.co.Escenario4;

public class MedicionEscenario4 {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        CatalogoProductos calentamiento = new CatalogoProductos();

        for (int i = 0; i < 1000; i++) {
            calentamiento.insertarProducto(
                    new ProductoCatalogo(
                            "W" + i, "Producto " + i,
                            i + 1000, "General"
                    )
            );
        }

        for (int cantidad : tamanios) {

            CatalogoProductos catalogo = new CatalogoProductos();

            Runtime runtime = Runtime.getRuntime();

            System.gc();

            long memoriaAntes = runtime.totalMemory()
                    - runtime.freeMemory();

            long inicio = System.nanoTime();

            for (int i = 0; i < cantidad; i++) {

                ProductoCatalogo producto = new ProductoCatalogo(
                        "P" + i,
                        "Producto " + i,
                        (i % 5000) + 1000,
                        "Categoria " + (i % 10)
                );

                catalogo.insertarProducto(producto);
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
                    + catalogo.cantidadProductos());
        }
    }
}
