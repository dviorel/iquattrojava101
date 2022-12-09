package bo.gob.impuestos.java101.pf;

public class FuncioneNoPura2 {

    static int valorPrevio = 0;

    static int sumar(int a, int b){
        valorPrevio += 1;
        // a.setNfsdfs
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
        System.out.println("ValorPrevio: " + valorPrevio);
        System.out.println("Funcion: " + sumar(3, 4));
    }

}
