package bo.gob.impuestos.java101.estructurales.flyweight;

public class Circulo implements Figura {

    String color;
    int x;
    int y;
    int radio;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo en " + x + ", " + y +
                           " con un radio de " + radio + " de color " +color);
    }
}
