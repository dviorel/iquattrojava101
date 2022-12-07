package bo.gob.impuestos.java101.estructurales.facade;

public class FiguraMaker {

    Figura cuadrado;
    Figura circulo;
    Figura rectangulo;

    public FiguraMaker() {
        this.cuadrado = new Cuadrado();
        this.circulo = new Circulo();
        this.rectangulo = new Rectangulo();
    }

    public void dibujarCuadrado(){
        this.cuadrado.dibujar();
    }
    public void dibujarRectangulo(){
        this.rectangulo.dibujar();
    }
    public void dibujarCirculo(){
        this.circulo.dibujar();
    }
}
