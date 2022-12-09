package bo.gob.impuestos.java101.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class DemoTake {
    private static Observable<String> datosDeUnServicioWeb(){
        String[] arr = {"a.", "b", "c.", "d", "e", "f"};
        return Observable.fromArray(arr);
    }

    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable = datosDeUnServicioWeb();
//        System.out.println("....");
        StringBuilder resultado = new StringBuilder();
        observable
            .delay(2, TimeUnit.SECONDS, Schedulers.newThread())
            .map(String::toUpperCase)
            .filter(c -> c.contains("."))
            .take(1)
            .subscribe(s -> resultado.append(s));
        Thread.sleep(3000);
        System.out.println("Resultado: " + resultado);
//            .subscribeWith(new Observer<String>() {
//                @Override
//                public void onSubscribe(Disposable disposable) {
//
//                }
//
//                @Override
//                public void onNext(String s) {
//                    System.out.println(s);
//                }
//
//                @Override
//                public void onError(Throwable throwable) {
//                    System.out.println("Error: " + throwable.getMessage());
//                }
//
//                @Override
//                public void onComplete() {
//                    System.out.println("Completed");
//                }
//            });
    }

}
