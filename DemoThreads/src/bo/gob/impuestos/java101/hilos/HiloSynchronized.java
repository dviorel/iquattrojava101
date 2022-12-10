package bo.gob.impuestos.java101.hilos;

public class HiloSynchronized extends Thread {

    public HiloSynchronized() {
    }

    public HiloSynchronized(String name) {
        super(name);
    }

    int i;

    void mostrarNumerosPares(){
        // hklhf fh
        System.out.println("Antes del ciclo: " + Thread.currentThread().getName());
        synchronized (this) {
            for (i = 0; i < 15; i += 2) {
                System.out.println("Par: " + i + ": " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("Despues del ciclo");
    }

    @Override
    public void run() {
        mostrarNumerosPares();
    }
}
