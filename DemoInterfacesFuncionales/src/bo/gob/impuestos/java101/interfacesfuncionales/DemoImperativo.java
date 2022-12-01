package bo.gob.impuestos.java101.interfacesfuncionales;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoImperativo {

    public static void main(String[] args) {
        List<Persona> personas = Source.obtenerListaPersonas();
        System.out.println("Personas ordenadas por nombre");
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        for (Persona persona:personas){
            System.out.println(persona);
        }

        System.out.println("Personas ordenadas por edad ascendente");
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                // return o2.getFechaNacimiento().compareTo(o1.getFechaNacimiento());
                return -o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
            }
        });
        for (Persona persona:personas){
            System.out.println(persona);
        }

        System.out.println("Personas ordenadas por edad descendente");
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return -o1.getEdad().compareTo(o2.getEdad());
            }
        });
        for (Persona persona:personas){
            System.out.println(persona);
        }

        System.out.println("Personas ordenadas por CI que empiezan con D");
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getCi().compareTo(o2.getCi());
            }
        });
        for (Persona persona:personas){
            if (persona.getNombre().startsWith("D")) {
                System.out.println(persona);
            }
        }

        List<Persona> personasFiltradas = new ArrayList<>();
        for (Persona persona:personas){
            if (persona.getFechaNacimiento().compareTo(
                LocalDate.of(2000, Month.JUNE, 30)) >= 0) {
                personasFiltradas.add(persona);
            }
        }
        System.out.println("Personas nacidas despues del 30/06/2000");
        for (Persona persona: personasFiltradas){
            System.out.println(persona);
        }

        int edadMaxima = 0;
        int edadMinima = Integer.MAX_VALUE;
        int sumaEdad = 0;
        long multiplicacionEdad = 1;
        for (Persona persona: personas){
            if (persona.getEdad() > edadMaxima){
                edadMaxima = persona.getEdad();
            }
            if (persona.getEdad() < edadMinima){
                edadMinima = persona.getEdad();
            }
            sumaEdad += persona.getEdad();
            multiplicacionEdad *= persona.getEdad();
            System.out.println("Multiplicacion: " + multiplicacionEdad);
        }
        System.out.println("La edad máxima es " + edadMaxima);
        System.out.println("La edad mínima es " + edadMinima);
        System.out.println("La suma de las edades es " + sumaEdad);
        System.out.println("La multiplicacion de las edades es " + multiplicacionEdad);





    }

}
