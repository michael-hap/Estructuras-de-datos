package uniquindio.edu.co.ejercicio7;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        IO.println("-------------AGREGANDO CLIENTES-----------");
        banco.agregarCliente("Michael");
        banco.agregarCliente("Jose");
        banco.mostrarClientes();

        IO.println("-------------AGREGANDO CLIENTE URGENTE-----------");
        banco.agregarClienteUrgente("David");
        banco.mostrarClientes();


        IO.println("------------COLA DESPUÉS DE ATENDER AL PRIMERO-----------");
        banco.atenderCliente();
        banco.mostrarClientes();
    }
}
