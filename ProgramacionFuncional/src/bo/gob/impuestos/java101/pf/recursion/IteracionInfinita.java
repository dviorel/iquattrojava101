package bo.gob.impuestos.java101.pf.recursion;

public class IteracionInfinita {

    static short contador = 0;

    public static void main(String[] args) {
        while(true){
            contador++;
            System.out.println(contador);
        }
    }

}
