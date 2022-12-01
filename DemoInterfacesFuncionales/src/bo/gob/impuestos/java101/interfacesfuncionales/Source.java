package bo.gob.impuestos.java101.interfacesfuncionales;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Source {

    public static List<Persona> obtenerListaPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "123",
                                 LocalDate.of(2000, Month.APRIL, 10)));
        personas.add(new Persona("Danny", "321",
                                 LocalDate.of(2003, 4, 11)));
        personas.add(new Persona("GAry", "321",
                                 LocalDate.of(2000, 4, 11)));
        personas.add(new Persona("Erick", "321",
                                 LocalDate.of(2000, Month.DECEMBER, 11)));
        personas.add(new Persona("Dennis", "487",
                                 LocalDate.of(1997, Month.JANUARY, 12)));
        personas.add(new Persona("Daniel", "101",
                                 LocalDate.of(1988, Month.FEBRUARY, 13)));
        personas.add(new Persona("Pedro", "502",
                                 LocalDate.of(1976, Month.NOVEMBER, 14)));
        return personas;
    }

}
