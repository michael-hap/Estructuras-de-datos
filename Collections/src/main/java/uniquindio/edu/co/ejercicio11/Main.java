package uniquindio.edu.co.ejercicio11;

public class Main {
    public static void main(String[] args) {
        Musica favoritas = new Musica();

        favoritas.agregarCancion("Bobo");
        System.out.println("Se agrega nuevamente Bobo?: " + favoritas.agregarCancion("Bobo"));
        favoritas.agregarCancion("La cinta rosa");
        favoritas.agregarCancion("Softcore");


        IO.println("----------Visualizando si es favorita 'Bobo'------------");
        System.out.println("Es favorita?:" + favoritas.esFavorita("Bobo"));
        IO.println("\n");

        IO.println("Listado de canciones");
        favoritas.mostrarCanciones();
        IO.println("\n");

        IO.println("Eliminando canción Softcore");
        favoritas.eliminarCancion("Softcore");
        IO.println("\n");

        IO.println("Listado de canciones actualizado");
        favoritas.mostrarCanciones();
    }
}
