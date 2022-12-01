package bo.gob.impuestos.java101.interfacesfuncionales;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class DemoInterfacesFuncionales {

    public static void main(String[] args) {
        List<Persona> personas = Source.obtenerListaPersonas();
        System.out.println("Personas ordenadas por nombre");
        personas
            .stream()
            .sorted(Comparator.comparing(Persona::getNombre))
            .forEach(System.out::println);

        System.out.println("Personas ordenadas por edad ascendente");
        personas
            .stream()
            .sorted(Comparator.comparing(Persona::getEdad))
            .forEach(System.out::println);

        System.out.println("Personas ordenadas por edad descendente ****");
        personas
            .stream()
            .sorted(
                (o1, o2) -> -o1.getEdad().compareTo(o2.getEdad())
            )
            .forEach(System.out::println);

        System.out.println("Personas ordenadas por CI que empiezan con D");
        personas
            .stream()
            .sorted(Comparator.comparing(Persona::getCi))
            .filter(p -> p.getNombre().startsWith("D"))
            .forEach(System.out::println);

        List<Persona> personasFiltradas = personas
            .stream()
            .filter(p -> p.getFechaNacimiento()
                          .compareTo(LocalDate.of(2020, Month.JUNE, 30)) >= 0)
            .collect(Collectors.toList());

        System.out.println("Personas nacidas despues del 30/06/2000");
        personasFiltradas.forEach(System.out::println);

        System.out.println("La edad máxima es " +
                           personas
                               .stream()
                               .mapToInt(p -> p.getEdad())
                               .max().orElse(-2));
        OptionalInt i = OptionalInt.empty();

        System.out.println("La edad mínima es " +
                           personas
                               .stream()
                               .mapToInt(p -> p.getEdad())
                               .min().orElse(-2));

        System.out.println("La suma de las edades es " +
                           personas
                               .stream()
                               .mapToInt(p -> p.getEdad())
                               .sum());
        System.out.println("La multiplicacion de las edades es " +
                           personas
                               .stream()
                               .mapToLong(p -> p.getEdad())
                               .reduce(1,
                                   (left, right) -> left *right
                               ));

        System.out.println("Las edadeds multiplicadas por 3 son:");
        personas
            .stream()
            .mapToLong(p -> p.getEdad() * 3)
            .forEach(System.out::println);




    }

}
