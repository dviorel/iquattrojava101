package bo.gob.impuestos.sin.java101.democomportamiento.observer;

public class DemoObserver {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("Primer cambio a valor 15");
        subject.setState(15);
        // ------
        new HexObserver(subject);
        System.out.println("Segundo cambio a valor 10");
        subject.setState(10);
    }

}
