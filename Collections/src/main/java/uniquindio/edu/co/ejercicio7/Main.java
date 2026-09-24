package uniquindio.edu.co.ejercicio7;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente("Michael");
        banco.agregarCliente("Jose");
        banco.agregarClienteUrgente("David");

        banco.mostrarClientes();


        banco.atenderCliente();
        banco.mostrarClientes();
    }
}
