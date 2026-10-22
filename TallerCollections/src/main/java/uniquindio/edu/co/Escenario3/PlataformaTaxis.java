package uniquindio.edu.co.Escenario3;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class PlataformaTaxis {

    private LinkedHashMap<String, SolicitudTaxi> solicitudes;

    public PlataformaTaxis() {
        solicitudes = new LinkedHashMap<>();
    }


    public boolean registrarSolicitud(SolicitudTaxi solicitud) {

        if (solicitudes.containsKey(solicitud.getId())) {
            return false;
        }

        solicitudes.put(solicitud.getId(), solicitud);
        return true;
    }


    public SolicitudTaxi atenderSolicitud() {

        if (solicitudes.isEmpty()) {
            return null;
        }

        Iterator<Map.Entry<String, SolicitudTaxi>> iterador =
                solicitudes.entrySet().iterator();

        Map.Entry<String, SolicitudTaxi> primera =
                iterador.next();

        SolicitudTaxi solicitud = primera.getValue();

        iterador.remove();

        return solicitud;
    }


    public boolean cancelarSolicitud(String id) {

        return solicitudes.remove(id) != null;
    }


    public SolicitudTaxi buscarSolicitud(String id) {
        return solicitudes.get(id);
    }


    public void mostrarSolicitudes() {

        if (solicitudes.isEmpty()) {
            System.out.println("No hay solicitudes pendientes.");
            return;
        }

        for (SolicitudTaxi solicitud : solicitudes.values()) {
            System.out.println(solicitud);
        }
    }


    public int cantidadSolicitudes() {
        return solicitudes.size();
    }
}
