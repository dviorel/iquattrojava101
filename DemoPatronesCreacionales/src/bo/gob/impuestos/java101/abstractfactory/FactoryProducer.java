package bo.gob.impuestos.java101.abstractfactory;

public class FactoryProducer {

    public static FiguraAbstractFactory obtenerFactory(String tipo){
        switch (tipo.toLowerCase()){
            case "normal":
                return new FiguraNormalFactory();
            case "redondeado":
                return new FiguraRedondeadaFactory();
            default:
                return new FiguraNormalFactory();
        }
    }

}
