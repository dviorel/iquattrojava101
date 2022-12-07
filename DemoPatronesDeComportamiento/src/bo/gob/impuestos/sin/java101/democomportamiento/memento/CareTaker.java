package bo.gob.impuestos.sin.java101.democomportamiento.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementos = new ArrayList<>();

    public void agregarMemento(Memento memento){
        this.mementos.add(memento);
    }

    public Memento getMemento(int indice){
        return mementos.get(indice);
    }

}
