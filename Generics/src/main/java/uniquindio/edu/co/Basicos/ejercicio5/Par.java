package uniquindio.edu.co.Basicos.ejercicio5;

public class Par<T>{

    private T valor1, valor2;
    public static void main(String[] args) {

        Par<String> par1 = new Par<>("Michael", "Michael");
        System.out.println(par1.verificarIguales());

        Par<Integer> par2 = new Par<>(58,98);
        System.out.println(par2.verificarIguales());
    }

    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public boolean verificarIguales() {
        return valor1.equals(valor2);
    }
}
