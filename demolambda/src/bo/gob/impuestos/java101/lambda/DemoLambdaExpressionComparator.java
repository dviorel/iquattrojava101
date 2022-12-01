package bo.gob.impuestos.java101.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoLambdaExpressionComparator {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Danny", "123"));
        personas.add(new Persona("Javier", "321"));
        personas.add(new Persona("Claudia", "267"));

        System.out.println("Inicial");
        for (Persona persona: personas){
            System.out.println(persona);
        }

        System.out.println("Ordenado");
        personas.sort((Persona o1, Persona o2) -> o1.getNombre().compareTo(o2.getNombre()));

        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));
        }
    }

}
