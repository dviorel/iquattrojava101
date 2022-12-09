package bo.gob.impuestos.java101.pf.recursion;

public class BusquedaElemento {

    static int busqueda(int[] arr, int itemBuscado, int posicion){
        if (posicion == arr.length){
            return -1;
        }
        if (arr[posicion] == itemBuscado){
            return posicion;
        }
        return busqueda(arr, itemBuscado, posicion +1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 4, 1};
        int itemBuscado = 9;
        int posicion = busqueda(arr, itemBuscado, 0);
        System.out.println(posicion);
    }

}
