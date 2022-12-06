package bo.gob.impuestos.java101.prototype;

public class DemoPrototype {

    public static void main(String[] args) {
        Figura figura1 = FiguraCache.obtenerFigura("1");
        figura1.dibujar();
        System.out.println("Figura1: " +figura1);
        Figura figura11 = FiguraCache.obtenerFigura("1");
        figura11.dibujar();
        System.out.println("Figura11: " +figura11);
        Figura figura2 = FiguraCache.obtenerFigura("2");
        figura2.dibujar();
        Figura figura3 = FiguraCache.obtenerFigura("3");
        figura3.dibujar();
    }

}
