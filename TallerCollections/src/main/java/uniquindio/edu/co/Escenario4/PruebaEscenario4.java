package uniquindio.edu.co.Escenario4;

public class PruebaEscenario4 {

    public static void main(String[] args) {

        CatalogoProductos catalogo = new CatalogoProductos();

        catalogo.insertarProducto(
                new ProductoCatalogo("P101", "Portátil",
                        2500000, "Tecnología")
        );

        catalogo.insertarProducto(
                new ProductoCatalogo("P102", "Mouse",
                        45000, "Tecnología")
        );

        catalogo.insertarProducto(
                new ProductoCatalogo("P103", "Teclado",
                        80000, "Tecnología")
        );

        catalogo.insertarProducto(
                new ProductoCatalogo("P104", "Monitor",
                        750000, "Tecnología")
        );

        catalogo.insertarProducto(
                new ProductoCatalogo("P105", "Audífonos",
                        120000, "Accesorios")
        );

        catalogo.insertarProducto(
                new ProductoCatalogo("P106", "Parlante",
                        120000, "Accesorios")
        );

        boolean registrado = catalogo.insertarProducto(
                new ProductoCatalogo("P101", "Otro portátil",
                        1800000, "Tecnología")
        );

        System.out.println("Duplicado registrado: " + registrado);

        System.out.println("\nBuscar producto P103:");
        System.out.println(catalogo.buscarProducto("P103"));

        System.out.println("\nBuscar producto P999:");
        System.out.println(catalogo.buscarProducto("P999"));

        System.out.println("\nProductos ordenados por precio:");
        catalogo.mostrarPorPrecio();

        System.out.println("\nCantidad de productos: "
                + catalogo.cantidadProductos());
    }
}
