package bo.gob.impuestos.java101.rxjava;

import java.time.LocalTime;

public class DemoSinRxJava {

    public static void main(String[] args) throws InterruptedException {
        String resultado = "Hola mundo";
        System.out.println("Iniciando la demo " + LocalTime.now());
        Thread.sleep(2000);
        System.out.println("Obtuvo respuesta: " + resultado +
                           " a las: " + LocalTime.now());
    }

}
