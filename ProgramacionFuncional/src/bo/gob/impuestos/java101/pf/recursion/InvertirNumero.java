package bo.gob.impuestos.java101.pf.recursion;

public class InvertirNumero {

    static int numeroInvertido(int n){
        return calculo(n, (int)Math.log10(n));
    }

    static int calculo(int n, int d){
        if (n < 10){
            return n;
        }
        return (int)((n % 10) * Math.pow(10, d) + calculo(n / 10, d - 1));
    }

    public static void main(String[] args) {
        int numero = 32546;
        System.out.println(numeroInvertido(numero));
    }

}
