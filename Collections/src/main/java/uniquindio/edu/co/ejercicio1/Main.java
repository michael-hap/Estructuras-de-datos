package uniquindio.edu.co.ejercicio1;

public class Main {

    public static void main(String[] args){
        Empresa miEmpresa= new Empresa();

        miEmpresa.agregarProducto(new Producto("02","Huevos",14000));
        miEmpresa.agregarProducto(new Producto("03", "PC", 1500000));
        miEmpresa.agregarProducto(new Producto ("01", "Leche", 5000));
        System.out.println(miEmpresa.agregarProducto(new Producto("02","Cafe",7000)));

        Producto productoEncontrado = miEmpresa.buscarProducto("02");
        System.out.println(productoEncontrado);

        System.out.println(" \n " );
        miEmpresa.mostrarProductos();
    }
}
