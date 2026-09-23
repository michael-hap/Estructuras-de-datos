package uniquindio.edu.co;

public class Factorial {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = factoriales(numero);
        System.out.println("resultado de factorial de " + numero + " es = " + resultado);

        cuentaRegresiva(numero);
        int suma= suma(numero);
        System.out.println("suma = " + suma);

        int suma_con_cola= suma2(numero,0);
        System.out.println("suma_con_cola = " + suma_con_cola);

        int resultado4 = Potencia(2, 4, 1);
        System.out.println("potencia = " + resultado4);

        int multiplicacion= multiplicar(5,4,0);
        System.out.println("multiplicacion = " + multiplicacion);

        int contador= ContarDigitos(479, 0);
        System.out.println("contador = " + contador);

        int sumaDigitos= SumaDigitos(358, 0);
        System.out.println("sumaDigitos = " + sumaDigitos);

        var par= EsPar(19,true);
        System.out.println("par = " + par);

        int invertido= Invertir(7654, 0);
        System.out.println("invertido = " + invertido);

        int maximoDigito= MaximoDigito(5879, 0);
        System.out.println("maximoDigito = " + maximoDigito);

        int contarCeros = ContarCeros(10510,0);
        System.out.println("contarCeros = " + contarCeros);
    }

    public static int factoriales(int n){
        if(n<=0){
            return 1;
        }

        return n * factoriales(n-1);
    }

    public static int cuentaRegresiva(int n){
        if(n<=0){
            return 0;
        }
        System.out.println("n = " + n);
        return n * cuentaRegresiva(n-1);
    }

    public static int suma(int n){
        if(n==0){
            return 0;
        }
        return n + suma(n-1);
    }
    
    public static int suma2(int n, int acc){
        if(n==0){
            return acc;
        }
        
        return suma2(n-1,acc + n );
    }

    public static int Potencia(int a, int b, int acc){
        if(a==0){
            return 0;
        }else if(b==0){
            return acc;
        }else{
            return Potencia(a, b-1, acc * a);
        }
    }

    public static int multiplicar(int a, int b, int acc){
        if(a==0){
            return 0;
        }else if(b==0){
            return acc;
        }
        return multiplicar(a,b-1, a + acc);
    }

    public static int ContarDigitos(int n, int acc){
        if(n==0){
            return acc;
        }
        int division = n/10;
        return ContarDigitos(division, acc + 1);
    }

    public static int SumaDigitos(int n, int acc){
        if(n<=0){
            return acc;
        }

        int div= n/10;
        int res= n%10;
        return SumaDigitos(div, res + acc);
    }

    public static boolean EsPar(int n, boolean acc){
        if(n==0){
            return acc;
        }else if (n==1){
            return false;
        }
        return EsPar(n-2, acc);
    }

    public static int Invertir(int n, int acc){
        if(n<=0){
            return acc;
        }

        int div = n/10;
        int res = n%10;
        return Invertir(div, acc*10 + res);
    }

    public static int MaximoDigito(int n, int acc){
        if(n<=0){
            return acc;
        }

        int div = n/10;
        int res = n%10;

        if(res>acc){
            return MaximoDigito(div,res);
        }else{
            return MaximoDigito(div,acc);
        }
    }

    public static int ContarCeros(int n, int acc){
        if(n<=0){
            return acc;
        }

        int div= n/10;
        int res= n%10;

        if(res==0){
            return ContarCeros(div, acc +1);
        }else{
            return ContarCeros(div, acc);
        }
    }
}



