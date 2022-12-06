package bo.gob.impuestos.java101.abstractfactory;

public class FiguraNormalFactory extends FiguraAbstractFactory {

    @Override
    Figura obtenerFigura(String tipoFigura) {
        switch (tipoFigura.toLowerCase()){
            case "cuadrado":
                return new Cuadrado();
            case "rectangulo":
                return new Rectangulo();
            case "triangulo":
                return new Triangulo();
            default:
                return new Cuadrado();
        }
    }
}
