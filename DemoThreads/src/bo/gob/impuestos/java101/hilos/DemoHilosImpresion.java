package bo.gob.impuestos.java101.hilos;

public class DemoHilosImpresion {

    public static void main(String[] args) throws InterruptedException {
        HilosImpresion t1 = new HilosImpresion();
        t1.start();
        Thread.sleep(500);
        int i = 0;
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        t1.suspend();
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        t1.resume();
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
        Thread.sleep(1000);
        System.out.println("Desde main: " + (i++));
    }

}
