package uniquindio.edu.co.Escenario3;

public class PruebaEscenario3 {

    public static void main(String[] args) {

        PlataformaTaxis plataforma = new PlataformaTaxis();


        plataforma.registrarSolicitud(
                new SolicitudTaxi("S101", "Ana",
                        "Universidad", "Centro")
        );

        plataforma.registrarSolicitud(
                new SolicitudTaxi("S102", "Carlos",
                        "Terminal", "Hospital")
        );

        plataforma.registrarSolicitud(
                new SolicitudTaxi("S103", "Laura",
                        "Parque", "Aeropuerto")
        );

        plataforma.registrarSolicitud(
                new SolicitudTaxi("S104", "Pedro",
                        "Centro", "Universidad")
        );


        boolean registrado = plataforma.registrarSolicitud(
                new SolicitudTaxi("S101", "Andres",
                        "Barrio Norte", "Centro")
        );

        System.out.println("Duplicado registrado: " + registrado);


        System.out.println("\nSolicitudes pendientes:");
        plataforma.mostrarSolicitudes();


        System.out.println("\nBuscar solicitud S103:");
        System.out.println(plataforma.buscarSolicitud("S103"));


        System.out.println("\nSolicitud atendida:");
        System.out.println(plataforma.atenderSolicitud());


        System.out.println("\nCancelar solicitud S103:");
        System.out.println(plataforma.cancelarSolicitud("S103"));


        System.out.println("\nSolicitudes pendientes actualizadas:");
        plataforma.mostrarSolicitudes();

        System.out.println("\nCantidad de solicitudes: "
                + plataforma.cantidadSolicitudes());
    }
}
