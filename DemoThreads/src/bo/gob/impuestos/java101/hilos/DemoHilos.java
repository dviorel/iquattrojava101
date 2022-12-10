package bo.gob.impuestos.java101.hilos;

public class DemoHilos {

    public static void main(String[] args) {
        System.out.println("Iniciando desde el Thread principal: " + Thread.currentThread().getName());
        Hilo hilo = new Hilo();
//        hilo.run();
        hilo.start();
        System.out.println("Terminando el Thread principal: " + Thread.currentThread().getName());
    }

}
