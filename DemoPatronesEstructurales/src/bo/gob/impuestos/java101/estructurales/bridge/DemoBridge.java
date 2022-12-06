package bo.gob.impuestos.java101.estructurales.bridge;

public class DemoBridge {

    public static void main(String[] args) {
        Figura circuloRojo = new Circulo(100, 2, 5, new CirculoRojo());
        circuloRojo.dibujar();
        Figura circuloVerde = new Circulo(102, 3, 1, new CirculoVerde());
        circuloVerde.dibujar();
    }

}
