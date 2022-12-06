package bo.gob.impuestos.java101.prototype;

import java.util.HashMap;
import java.util.Map;

public class FiguraCache {

    private static Map<String, Figura> figuras = new HashMap<>();

    static {
        figuras.put("1", new Circulo());
        figuras.put("2", new Cuadrado());
        figuras.put("3", new Rectangulo());
    }

    public static Figura obtenerFigura(String idFigura){
        Figura figura = figuras.get(idFigura);
        return figura.clone();
//        return figuras.get(idFigura);
    }




}
