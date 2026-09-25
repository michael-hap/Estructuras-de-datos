package uniquindio.edu.co.ejercicio15;

public class Main {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();


        directorio.agregarContacto("Ana", "3167899547");
        directorio.agregarContacto("David", "31547");
        directorio.agregarContacto("Michael", "316988");
        directorio.agregarContacto("Ana", "3157148975");
        directorio.mostrarContactos();

        IO.println("Eliminar contacto");
        directorio.eliminarContacto("David");
        directorio.mostrarContactos();

        IO.println("Buscar contacto");
        System.out.println(directorio.buscarContacto("David"));

    }
}
