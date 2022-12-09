package bo.gob.impuestos.java101.pf;

public class Aux {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // Tiempo de Ejecucion constante
        int valor = arr[2];

        // TIempo de ejecucion lineal
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // Tiempo de ejecucion cuadratico
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temporal = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporal;
                }
            }
        }

    }

}
