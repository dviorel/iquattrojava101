package bo.gob.impuestos.java101.estructurales.bridge;

public class CirculoRojo implements DibujarAPI {

    @Override
    public void dibujarCirculo(int radio, int x, int y) {
        System.out.println("Dibujando circulo rojo en " + x + ", " + y);
    }
}
