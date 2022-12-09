package bo.gob.impuestos.java101.pf.recursion;

public class MaximoDeArrayMetodo1 {

    static int encontrarMaximo(int[] arr, int indice, int max){
        if (indice == arr.length){
            return max;
        }
        if (arr[indice] > max){
            max = encontrarMaximo(arr, indice + 1, arr[indice]);
        }
        else{
            max = encontrarMaximo(arr, indice + 1, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 2, 9, 3};
        System.out.println(encontrarMaximo(arr, 0, 0));
    }

}
