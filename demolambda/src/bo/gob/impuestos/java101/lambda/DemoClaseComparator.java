package bo.gob.impuestos.java101.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoClaseComparator {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Danny", "123"));
        personas.add(new Persona("Javier", "321"));
        personas.add(new Persona("Claudia", "267"));

        System.out.println("Inicial");
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));
        }
        System.out.println("Ordenado");
        personas.sort(new PersonaNombreComparator());
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));
        }
    }

}
