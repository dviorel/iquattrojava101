package bo.gob.impuestos.java101.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoLambdaExpressionInferenciaTipoDato {

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
        personas.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));

        personas.forEach((Persona p) -> System.out.println(p));

        System.out.println("OrdenadoV2");
        personas.forEach(DemoLambdaExpressionInferenciaTipoDato::imprimir);

    }

    public static void imprimir(Persona p){
        System.out.println(p);
    }

}
