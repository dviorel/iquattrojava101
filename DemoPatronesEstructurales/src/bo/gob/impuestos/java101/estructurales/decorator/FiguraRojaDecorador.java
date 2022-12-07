package bo.gob.impuestos.java101.estructurales.decorator;

public class FiguraRojaDecorador extends FiguraDecorador {

    public FiguraRojaDecorador(Figura figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        figura.dibujar();
        System.out.println("El borde es rojo");
    }
}
