package bo.gob.impuestos.java101.pf;

public class FuncioneNoPura {

    static int valorPrevio = 0;

    static int sumar(int a, int b){
        valorPrevio += 1;
        return a + b +valorPrevio;
    }

    public static void main(String[] args) {
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
        System.out.println(sumar(3, 4));
    }

}
