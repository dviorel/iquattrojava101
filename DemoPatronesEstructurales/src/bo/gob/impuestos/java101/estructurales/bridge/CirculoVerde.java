package bo.gob.impuestos.java101.estructurales.bridge;

public class CirculoVerde implements DibujarAPI {

    @Override
    public void dibujarCirculo(int radio, int x, int y) {
        System.out.println("Dibujando circulo verde en " + x + ", " + y);
    }
}
