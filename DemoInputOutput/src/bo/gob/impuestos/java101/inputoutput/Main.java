package bo.gob.impuestos.java101.inputoutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero N");
        int n = scanner.nextInt();
        System.out.println("Ingrese " + n + " números separados por espacios");
        int[] numeros = new int[n];
        for (int i = 0; i<n;i++){
            numeros[i] = scanner.nextInt();
        }
        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println("El promedio es: "
                           + Arrays.stream(numeros).average().getAsDouble());
    }
}