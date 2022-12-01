package bo.gob.impuestos.java101.lambda;

import java.util.Comparator;

public class PersonaNombreComparator implements Comparator<Persona> {

//    @Override
    public String toString() {
        // Alguna logica especial
        return super.toString();
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
