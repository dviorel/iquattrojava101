package bo.gob.impuestos.java101.factorymethod;

public class FiguraFactory {

    public static Figura obtenerFigura(String tipoFigura){
        switch (tipoFigura.toLowerCase()){
            case "rectangulo":
                return new Rectangulo();
            case "circulo":
                return new Circulo();
            case "cuadrado":
                return new Cuadrado();
            default:
                throw new RuntimeException("El tipo " +tipoFigura + " no está soportado");
        }
    }

}
