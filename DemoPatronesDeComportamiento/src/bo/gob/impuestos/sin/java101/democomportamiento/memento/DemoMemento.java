package bo.gob.impuestos.sin.java101.democomportamiento.memento;

public class DemoMemento {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.agregarMemento(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.agregarMemento(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
