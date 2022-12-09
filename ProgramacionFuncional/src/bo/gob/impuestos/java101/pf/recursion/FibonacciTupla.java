package bo.gob.impuestos.java101.pf.recursion;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciTupla {

    static class Tupla<T, U>{
        public final T _1;
        public final U _2;

        public Tupla(T _1, U _2) {
            this._1 = _1;
            this._2 = _2;
        }
    }

    public static void main(String[] args) {
        int serie = 10000;
        Tupla<Long, Long> semilla = new Tupla<>(1L, 1L);
        UnaryOperator<Tupla<Long, Long>> f =
            x -> new Tupla<>(x._2, x._1 + x._2);
        LocalTime start = LocalTime.now();
        Stream<Long> fibonacciStream = Stream.iterate(semilla, f)
                                             .map(x -> x._1)
                                             .limit(serie);
        String result = fibonacciStream
            .map(Object::toString).collect(Collectors.joining(", "));
        long millis = start.until(LocalTime.now(), ChronoUnit.MILLIS);
        System.out.printf("Serie Fibonacci del 1 al %d generada en %d milisegundos", serie, millis);
        System.out.println(result);

    }

}
