package bo.gob.impuestos.java101.rxjava;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class DemoMaybe {

    public static void main(String[] args) throws InterruptedException {
        // Crea el Observable
//          Maybe<String> testSingle = Maybe.just("Hola mundo maybe!");
        Maybe<String> testSingle = Maybe.empty();
        System.out.println("Iniciando la demo " + LocalTime.now());
        // Crea el Observer
        testSingle
            .delay(2, TimeUnit.SECONDS)
            .subscribeWith(new MaybeObserver<String>() {
                @Override
                public void onSubscribe(Disposable disposable) {
                    System.out.println("Nueva suscripcion " + LocalTime.now());
                }

                @Override
                public void onSuccess(String s) {
                    System.out.println("Mensaje recibido: " + s + ": " + LocalTime.now());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error recibido: " +throwable.getMessage() + ": " + LocalTime.now());
                }

                @Override
                public void onComplete() {
                    System.out.println("Peticion completada: " + LocalTime.now());
                }
            });
        System.out.println("Ya suscrito " + LocalTime.now());

        Thread.sleep(3000);
    }

}
