package bo.gob.impuestos.java101.abstractfactory;

import bo.gob.impuestos.java101.factorymethod.Circulo;

public class DemoAbstractFactory {

    public static void main(String[] args) {
        String tipoObjetos = "normal"; // "normal", "redondeado"
        FiguraAbstractFactory factory = FactoryProducer.obtenerFactory(tipoObjetos);
        Figura cuadrado = factory.obtenerFigura("cuadrado");
        cuadrado.dibujar();
        Figura rectangulo = factory.obtenerFigura("rectangulo");
        rectangulo.dibujar();
        Figura triangulo = factory.obtenerFigura("triangulo");
        triangulo.dibujar();
    }

}
