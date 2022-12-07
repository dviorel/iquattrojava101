package bo.gob.impuestos.java101.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FiguraFactory {

    private static Map<String, Figura> mapaCirculos = new HashMap<>();

    public static Figura obtenerCirculo(String color){
        Circulo circulo = (Circulo) mapaCirculos.get(color);
        if (circulo == null){
            circulo = new Circulo(color);
            System.out.println("Creando un circulo de color " + color);
            mapaCirculos.put(color, circulo);
        }
        return circulo;
    }


}
