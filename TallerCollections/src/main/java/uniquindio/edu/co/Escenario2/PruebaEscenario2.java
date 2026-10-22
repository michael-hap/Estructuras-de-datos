
package uniquindio.edu.co.Escenario2;

public class PruebaEscenario2 {

    public static void main(String[] args) {

        PlataformaVentas plataforma = new PlataformaVentas();


        plataforma.insertarProducto(
                new Producto("P101", "Mouse", 45000, "Tecnología")
        );

        plataforma.insertarProducto(
                new Producto("P102", "Teclado", 80000, "Tecnología")
        );

        plataforma.insertarProducto(
                new Producto("P103", "Cuaderno", 12000, "Papelería")
        );

        plataforma.insertarProducto(
                new Producto("P104", "Audífonos", 65000, "Tecnología")
        );

        plataforma.insertarProducto(
                new Producto("P105", "Lapicero", 3000, "Papelería")
        );


        boolean registrado = plataforma.insertarProducto(
                new Producto("P101", "Otro mouse", 50000, "Tecnología")
        );

        System.out.println("Duplicado registrado: " + registrado);


        System.out.println("\nBuscar producto P103:");
        System.out.println(plataforma.buscarProducto("P103"));


        System.out.println("\nProductos ordenados por precio:");
        plataforma.mostrarPorPrecio();


        System.out.println("\nProductos más recientes primero:");
        plataforma.mostrarRecientes();


        System.out.println("\nProductos de Tecnología:");
        plataforma.filtrarPorCategoria("Tecnología");

        System.out.println("\nCantidad total: "
                + plataforma.cantidadProductos());
    }
}
