package bo.gob.impuestos.java101.estructurales.decorator;

public abstract class FiguraDecorador implements Figura {

    Figura figura;
    public FiguraDecorador(Figura figura){
        this.figura = figura;
    }
    @Override
    public void dibujar() {
        this.figura.dibujar();
    }
}
