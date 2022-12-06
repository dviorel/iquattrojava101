package bo.gob.impuestos.java101.estructurales.bridge;

public class Circulo extends Figura {

    int x;
    int y;
    int radio;

    public Circulo(int radio, int x, int y, DibujarAPI dibujarAPI){
        super(dibujarAPI);
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    @Override
    void dibujar() {
        dibujarAPI.dibujarCirculo(this.radio, this.x, this.y);
    }
}
