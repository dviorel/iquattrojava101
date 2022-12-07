package bo.gob.impuestos.java101.estructurales.flyweight;

public class DemoFlyweight {

    private static final String[] colores = {"Rojo", "Negro", "Azul", "Blanco"};

    public static void main(String[] args) {
        for (int i = 0; i <20; i++){
            Circulo circulo = (Circulo) FiguraFactory.obtenerCirculo(getRandomColor());
            circulo.setX(getRandomX());
            circulo.setY(getRandomY());
            circulo.dibujar();
        }
    }

    private static String getRandomColor(){
        return colores[(int)(Math.random() * colores.length)];
    }
    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }
}
