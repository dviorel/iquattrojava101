package bo.gob.impuestos.java101.pf.recursion;

public class MaximoDeArrayMetodo2 {

    static int encontrarMaximo(int[] arr, int indice){
        int max = 0;
        if (indice != arr.length){
            System.out.println("Indice: " + indice + ", max = " + max);
            max = Math.max(arr[indice], encontrarMaximo(arr, indice + 1));
//             System.out.println("Indice: " + indice + ", max = " + max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 2, 9, 3};
        System.out.println(encontrarMaximo(arr, 0));
    }

}
