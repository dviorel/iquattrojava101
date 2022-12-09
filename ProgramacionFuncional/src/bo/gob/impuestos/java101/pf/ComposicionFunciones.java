package bo.gob.impuestos.java101.pf;

public class ComposicionFunciones {

    static int suma(int a, int b){
        return a +b;
    }

    static int multiplicacion(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(suma(multiplicacion(3, 4), multiplicacion(5, 6)));
    }

}
