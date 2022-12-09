package bo.gob.impuestos.java101.pf.recursion;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FibonacciTailRecursive {

    static long fibonacci(long n){
        return f(1, 0, n);
    }

    static long f(long acc1, long acc2, long x){
        if (x == 1){
            return acc1 + acc2;
        }
        System.out.println(acc1 + ", " + acc2 + ", " + x);
        return f(acc2, acc1 + acc2, x - 1);
    }

    public static void main(String[] args) {
        int n = 10; //5=0,10=0,20=1,40=549,45=5787
                    //5=0,10=0,20=0,40=0,  45=0,
        LocalTime inicio = LocalTime.now();
        long resultado = fibonacci(n);
        LocalTime fin = LocalTime.now();
        System.out.println("Resultado: " + resultado + ", calculado en "
                           + inicio.until(fin, ChronoUnit.MILLIS) + " milisegundos");
    }

}
