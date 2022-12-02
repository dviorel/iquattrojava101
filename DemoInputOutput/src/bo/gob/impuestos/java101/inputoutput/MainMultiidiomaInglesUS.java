package bo.gob.impuestos.java101.inputoutput;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainMultiidiomaInglesUS {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("mensajes", new Locale("en"));
        Scanner scanner = new Scanner(System.in);
        System.out.println(bundle.getString("entrada.numero"));
        int n = scanner.nextInt();
        System.out.println(String.format(bundle.getString("entrada.varios"), n));
        int[] numeros = new int[n];
        for (int i = 0; i<n;i++){
            numeros[i] = scanner.nextInt();
        }
        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println(
            String.format(bundle.getString("salida.resultado"),
                          Arrays.stream(numeros).average().getAsDouble()));
    }
}