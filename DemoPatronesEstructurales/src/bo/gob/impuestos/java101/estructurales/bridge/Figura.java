package bo.gob.impuestos.java101.estructurales.bridge;

public abstract class Figura {

    DibujarAPI dibujarAPI;

    public Figura(DibujarAPI dibujarAPI){
        this.dibujarAPI = dibujarAPI;
    }

    abstract void dibujar();

}
