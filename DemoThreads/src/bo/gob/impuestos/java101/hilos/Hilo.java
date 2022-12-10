package bo.gob.impuestos.java101.hilos;

public class Hilo extends Thread {

    @Override
    public void run() {
         System.out.println("Iniciando hilo: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Terminando hilo: " + Thread.currentThread().getName());
//        System.out.println("Corriendo en el hilo: ");
    }
}
