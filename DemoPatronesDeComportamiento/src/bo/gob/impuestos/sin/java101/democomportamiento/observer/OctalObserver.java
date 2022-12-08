package bo.gob.impuestos.sin.java101.democomportamiento.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Octal String: " +
                           Integer.toOctalString(subject.getState()));
    }
}
