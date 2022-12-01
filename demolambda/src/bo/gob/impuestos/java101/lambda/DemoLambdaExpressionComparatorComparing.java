package bo.gob.impuestos.java101.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoLambdaExpressionComparatorComparing {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Danny", "123"));
        personas.add(new Persona("Danny", "320"));
        personas.add(new Persona("Javier", "321"));
        personas.add(new Persona("Claudia", "267"));

        System.out.println("Inicial");
        personas.forEach((p) -> System.out.println(p));

        System.out.println("Ordenado");
        personas.sort(Comparator.comparing(Persona::getNombre));

        personas.forEach(System.out::println);
    }

}
