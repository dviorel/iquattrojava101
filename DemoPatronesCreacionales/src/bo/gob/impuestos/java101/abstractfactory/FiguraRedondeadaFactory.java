package bo.gob.impuestos.java101.abstractfactory;

public class FiguraRedondeadaFactory extends FiguraAbstractFactory {

    @Override
    Figura obtenerFigura(String tipoFigura) {
        switch (tipoFigura.toLowerCase()){
            case "cuadrado":
                return new CuadradoRedondeado();
            case "rectangulo":
                return new RectanguloRedondeado();
            case "triangulo":
                return new TrianguloRedondeado();
            default:
                return new CuadradoRedondeado();
        }
    }
}
