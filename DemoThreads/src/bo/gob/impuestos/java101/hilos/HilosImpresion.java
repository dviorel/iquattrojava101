package bo.gob.impuestos.java101.hilos;

public class HilosImpresion extends Thread {

    void imprimir(){
        for (int i = 0; i < 10; i++){
            System.out.println("Desde hilo: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public void run() {
        imprimir();
    }
}
