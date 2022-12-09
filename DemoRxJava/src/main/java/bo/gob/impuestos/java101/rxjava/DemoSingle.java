package bo.gob.impuestos.java101.rxjava;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class DemoSingle {

    public static void main(String[] args) throws InterruptedException {
        // Crea el Observable
         Single<String> testSingle = Single.just("Hola mundo!");
//        Single<String> testSingle = Single.error(new RuntimeException("Falló"));
        System.out.println("Iniciando la demo " + LocalTime.now());
        // Crea el Observer
        testSingle
            .delay(2, TimeUnit.SECONDS)
            .subscribeWith(new SingleObserver<String>() {
                public void onSubscribe(Disposable disposable) {
                    System.out.println("Nueva suscripcion " + LocalTime.now());
                }
                public void onSuccess(String s) {
                    System.out.println("Mensaje recibido: " + s + ": " + LocalTime.now());
                }
                public void onError(Throwable throwable) {
                    System.out.println("Error recibido: " + throwable.getMessage()
                                       + ": " + LocalTime.now());
                }
            });
        System.out.println("Ya suscrito " + LocalTime.now());

        Thread.sleep(3000);
    }

}
