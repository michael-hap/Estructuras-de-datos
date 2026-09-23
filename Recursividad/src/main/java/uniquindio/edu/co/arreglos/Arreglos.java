package uniquindio.edu.co.arreglos;

import java.util.Arrays;

public class Arreglos {

    public static void main (String[] args){
        int[] numeros= {1,2,3,2,4,2};
        imprimir(numeros, 0);

        int sumaNumeros= suma(numeros,0);
        System.out.println("sumaNumeros = " + sumaNumeros);

        int numeroMayor= elementoMayor(numeros,0, 0);
        System.out.println("numeroMayor = " + numeroMayor);

        int contador= contar(numeros,0,2,0);
        System.out.println("contador = " + contador);

        boolean existe= existeElemento(numeros,0,1,true);
        System.out.println("existe = " + existe);

        int contadorPares= contarPares(numeros,0,0);
        System.out.println("contadorPares = " + contadorPares);

        int sumadorPares= sumarPares(numeros,0,0);
        System.out.println("sumadorPares = " + sumadorPares);

        invertirArreglo(numeros,0,numeros.length-1);
        System.out.println(" arreglo Invertido= " + Arrays.toString(numeros) );

        int buscadorPos= buscarPosicion(numeros,0,1);
        System.out.println("buscadorPosicion = " + buscadorPos);

        intercambiarPosicion(numeros,0, numeros.length-1);
        System.out.println(" Intercambiador: " + Arrays.toString(numeros));

        invertirArregloParte(numeros,1,numeros.length-2);
        System.out.println(" arreglo Invertido= " + Arrays.toString(numeros) );
    }

    public static void imprimir(int[] arreglo, int indice){
        if(indice==arreglo.length){
            return;
        }
        System.out.println(arreglo[indice]);
        imprimir(arreglo, indice + 1);
    }

    public static int suma(int[] arreglo, int indice){
        if(indice== arreglo.length){
            return 0;
        }

        return arreglo[indice] + suma(arreglo, indice + 1);
    }

    public static int elementoMayor(int[] arreglo, int indice, int acc){
        if(indice==arreglo.length){
            return acc;
        }
        if(arreglo[indice]>acc){
            return elementoMayor(arreglo, indice + 1, arreglo[indice]);
        }else{
            return elementoMayor(arreglo, indice + 1, acc);
        }
    }

    public static int contar(int[]arreglo, int indice, int numero, int acc){
        if(arreglo.length==indice){
            return acc;
        }
        if(arreglo[indice]==numero){
            return contar(arreglo, indice + 1, numero, acc + 1);
        }
        return contar(arreglo, indice + 1, numero, acc);
    }

    public static boolean existeElemento(int[]arreglo, int i, int n, boolean acc){
        if(arreglo.length==i){
            return acc;
        }else if(arreglo[i]==n){
            return acc;
        }else{
            return existeElemento(arreglo, i + 1, n, false);
        }
    }

    public static int contarPares(int[]arreglo, int indice, int acc){
        if(arreglo.length==indice){
            return acc;
        }

        if(arreglo[indice]%2==0){
            return contarPares(arreglo, indice +1 , acc +1);
        }
        return contarPares(arreglo, indice + 1, acc);
    }

    public static int sumarPares(int[]arreglo, int indice, int acc){
        if(arreglo.length==indice){
            return acc;
        }

        if(arreglo[indice]%2==0){
            return sumarPares(arreglo, indice + 1, acc + arreglo[indice]);
        }
        return sumarPares(arreglo, indice + 1, acc);
    }

    public static void invertirArreglo(int[] arreglo, int inicio, int fin) {

        if(inicio >= fin){
            return;
        }

        int guardador= arreglo[inicio];
        arreglo[inicio]= arreglo[fin];
        arreglo[fin] = guardador;
        invertirArreglo(arreglo, inicio + 1, fin - 1);

    }

    public static int buscarPosicion(int[]arreglo, int i, int numero){

        if(arreglo.length== i) {
            return -1;
        }

        if(arreglo[i]== numero){
            return i;
        }

        return buscarPosicion(arreglo, i + 1, numero);

    }

    public static void intercambiarPosicion(int[]arreglo, int inicio, int fin){
        if(inicio == 1 && fin== arreglo.length -2){
            return;
        }
        int guardador= arreglo[inicio];
        arreglo[inicio]= arreglo[fin];
        arreglo[fin]= guardador;
        intercambiarPosicion(arreglo, inicio + 1, fin - 1);
    }

    public static void invertirArregloParte(int[] arreglo, int inicio, int fin) {

        if(inicio >= fin){
            return;
        }

        int guardador= arreglo[inicio];
        arreglo[inicio]= arreglo[fin];
        arreglo[fin] = guardador;
        invertirArreglo(arreglo, inicio + 1, fin - 1);

    }
}
