package bo.gob.impuestos.java101.rxjava;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;

public class DemoCompletable {

    public static void main(String[] args) throws InterruptedException {
        // Crea el Observable
         Completable completable = Completable.complete();
//        Completable completable = Completable.error(new RuntimeException("Demo de error!"));
        System.out.println("Iniciando la demo " + LocalTime.now() + ": " + Thread.currentThread().getName());
        // Crea el Observer
        completable
            .delay(2, TimeUnit.SECONDS)
            .subscribeWith(new CompletableObserver() {
                @Override
                public void onSubscribe(Disposable disposable) {
                    System.out.println("Nueva suscripcion " + LocalTime.now() + ": " + Thread.currentThread().getName());
                }

                @Override
                public void onComplete() {
                    System.out.println("Peticion completada: " + LocalTime.now() + ": " + Thread.currentThread().getName());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error recibido: " +throwable.getMessage() + ": " + LocalTime.now() + ": " + Thread.currentThread().getName());
                }
            });
        System.out.println("Ya suscrito " + LocalTime.now() + ": " + Thread.currentThread().getName());

        Thread.sleep(3000);
    }

}
