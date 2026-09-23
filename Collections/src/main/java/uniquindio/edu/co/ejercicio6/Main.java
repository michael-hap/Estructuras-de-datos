package uniquindio.edu.co.ejercicio6;

public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        miEmpresa.agregarProducto(new Producto("Arroz", "01", 5000));
        miEmpresa.agregarProducto(new Producto("Leche", "02", 3500));
        miEmpresa.agregarProducto(new Producto("Huevos", "03", 14000));

        boolean productoAgregado = miEmpresa.agregarProducto(new Producto("Arroz", "01", 5000));
        System.out.println("productoAgregado = " + productoAgregado);
        System.out.println(miEmpresa.buscarProducto("02"));
        System.out.println("\n" );

        System.out.println("--------------Ordenar por precio----------------");
        miEmpresa.ordenarPorPrecio();
        miEmpresa.mostrarProductos();
        System.out.println("\n" );

        System.out.println("---------------Ordenar por codigo---------------");
        miEmpresa.ordenarPorCodigo();
        miEmpresa.mostrarProductos();
        System.out.println("\n" );

        System.out.println("------------Ordenar por nombre---------------");
        miEmpresa.ordenarPorNombre();
        miEmpresa.mostrarProductos();
    }
}
