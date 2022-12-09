package bo.gob.impuestos.java101.rxjava;

import java.util.Random;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class DemoSchedulerTrampoline {

    public static void main(String[] args) throws InterruptedException {
        Observable.just("A", "AB", "ABC")
          .flatMap(v -> getLengthWithDelay(v)
              .doOnNext(s ->
                            System.out.println("Processing Thread "
                                                + Thread.currentThread().getName()))
              .subscribeOn(Schedulers.trampoline()))
          .subscribe(length ->
                         System.out.println("Receiver Thread "
                                                  + Thread.currentThread().getName()
                                                  + ", Item length " + length));

        Thread.sleep(8000);
    }
    protected static Observable<Integer> getLengthWithDelay(String v) {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(3) * 1000);
            return Observable.just(v.length());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }



}
