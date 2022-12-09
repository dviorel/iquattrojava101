package bo.gob.impuestos.java101.pf.recursion;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Fibonacci {

    static long fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 60; //5=0,10=0,20=1,40=549,45=5787
        LocalTime inicio = LocalTime.now();
        long resultado = fibonacci(n);
        LocalTime fin = LocalTime.now();
        System.out.println("Resultado: " + resultado + ", calculado en "
                           + inicio.until(fin, ChronoUnit.MILLIS) + " milisegundos");
    }

}
