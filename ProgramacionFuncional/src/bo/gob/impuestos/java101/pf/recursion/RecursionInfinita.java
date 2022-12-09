package bo.gob.impuestos.java101.pf.recursion;

public class RecursionInfinita {

    static long contador = 0;

    static void recursiva(){
        contador++;
        System.out.println(contador);
        recursiva();
    }

    public static void main(String[] args) {
        recursiva();
    }

}
