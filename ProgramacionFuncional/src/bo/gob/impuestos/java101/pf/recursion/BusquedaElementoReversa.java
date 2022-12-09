package bo.gob.impuestos.java101.pf.recursion;

public class BusquedaElementoReversa {

    static int busqueda(int[] arr, int itemBuscado, int posicion){
        if (posicion == -1){
            return -1;
        }
        if (arr[posicion] == itemBuscado){
            return posicion;
        }
        return busqueda(arr, itemBuscado, posicion - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 4, 1};
        int itemBuscado = 93;
        int posicion = busqueda(arr, itemBuscado, arr.length -1);
        System.out.println(posicion);
    }

}
