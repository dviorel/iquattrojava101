package bo.gob.impuestos.java101.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoLambdaSorted {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Danny", "123"));
        personas.add(new Persona("Danny", "320"));
        personas.add(new Persona("Javier", "321"));
        personas.add(new Persona("Claudia", "267"));

        System.out.println("Inicial");
        personas.forEach((p) -> System.out.println(p));

        System.out.println("Ordenado");
        personas.stream().sorted().forEach(System.out::println);

        System.out.println("Ordenado por CI");
        personas.stream().sorted(Comparator.comparing(Persona::getCi)).forEach(System.out::println);

        System.out.println("Final");
        personas.forEach((p) -> System.out.println(p));
    }

}
