package bo.gob.impuestos.java101.hilos;

public class DemoSynchronized {

    public static void main(String[] args) {
        HiloSynchronized t1 = new HiloSynchronized("HiloDeConteo");
        t1.start();
        t1.mostrarNumerosPares();
        for (int i = 0; i<20;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // Consumo de servicio web i
                }
            });
        }
    }

}
