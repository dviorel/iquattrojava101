package bo.gob.impuestos.java101.pf.recursion;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciStreamMemoization {

    static Map<Long, Long> memory = new ConcurrentHashMap<>();

    static long fibonacci(long n){
        return memory.computeIfAbsent(n, x -> f(1, 0, x));
    }

    static long f(long acc1, long acc2, long x){
        if (x == 1){
            return acc1 + acc2;
        }
        return f(acc2, acc1 + acc2, x - 1);
    }

    public static void main(String[] args) {
        int limite = 10000;
        LocalTime inicio = LocalTime.now();
        String resultado = IntStream.rangeClosed(1, limite)
            .boxed()
            .map(n -> String.valueOf(fibonacci(n)))
            .collect(Collectors.joining(", "));
        LocalTime fin = LocalTime.now();
        System.out.println(resultado);
        System.out.println("Calculado en: " + inicio.until(fin, ChronoUnit.MILLIS));
        inicio = LocalTime.now();
        resultado = IntStream.rangeClosed(1, limite)
                             .boxed()
                             .map(n -> String.valueOf(fibonacci(n)))
                             .collect(Collectors.joining(", "));
        fin = LocalTime.now();
        System.out.println(resultado);
        System.out.println("Calculado en: " + inicio.until(fin, ChronoUnit.MILLIS));
    }

}
