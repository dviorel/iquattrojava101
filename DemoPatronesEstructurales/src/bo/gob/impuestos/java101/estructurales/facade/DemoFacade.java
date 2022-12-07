package bo.gob.impuestos.java101.estructurales.facade;

public class DemoFacade {

    public static void main(String[] args) {
        FiguraMaker figuraMaker = new FiguraMaker();
        figuraMaker.dibujarCuadrado();
        figuraMaker.dibujarCirculo();
        figuraMaker.dibujarRectangulo();
    }

}
