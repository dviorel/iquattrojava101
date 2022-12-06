package bo.gob.impuestos.java101.factorymethod;

public class DemoFactoryMethod {

    public static void main(String[] args) {
        Figura circulo = FiguraFactory.obtenerFigura("circulo");
        circulo.dibujar();
        Figura rectangulo = FiguraFactory.obtenerFigura("Rectangulo");
        rectangulo.dibujar();
        Figura cuadrado = FiguraFactory.obtenerFigura("CUADRADO");
        cuadrado.dibujar();
    }

}
