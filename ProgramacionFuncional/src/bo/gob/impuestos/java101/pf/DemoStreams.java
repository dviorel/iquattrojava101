package bo.gob.impuestos.java101.pf;

import java.util.stream.IntStream;

public class DemoStreams {

    static void funcional(){
        double promedio = IntStream.range(1, 10).average().getAsDouble();
        System.out.println(promedio);
    }

    static void imperativo(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        double promedio = (suma * 1.0) / numeros.length;
        System.out.println(promedio);
    }

    public static void main(String[] args) {
        funcional();
        imperativo();
    }



}
