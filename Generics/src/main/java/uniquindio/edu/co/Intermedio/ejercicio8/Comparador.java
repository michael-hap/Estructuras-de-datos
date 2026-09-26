package uniquindio.edu.co.Intermedio.ejercicio8;

public class Comparador<T extends Comparable<T>>{
    public static void main(String[] args) {
        Comparador<Integer> comparador = new Comparador<>();
        System.out.println(comparador.mayor(43,58));
    }

    public T mayor(T a, T b){
        if(a.compareTo(b) > 0){
            return a;
        }
        return b;
    }
}
