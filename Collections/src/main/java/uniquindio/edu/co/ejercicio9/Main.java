package uniquindio.edu.co.ejercicio9;

public class Main {
    public static void main(String[] args) {
        Navegador navegador= new Navegador();

        navegador.visitarPagina("Youtube");
        navegador.visitarPagina("Google");
        navegador.visitarPagina("Facebook");

        IO.println("---------PÁGINA ACTUAL--------");
        System.out.println(navegador.paginaActual());
        IO.println("\n");

        navegador.retroceder();

        IO.println("-----------PÁGINA ANTERIOR---------");
        System.out.println(navegador.paginaActual());
        IO.println("\n");
        IO.println("-----------HISTORIAL-----------");
        System.out.println(navegador.mostrarHistorial());

    }
}
