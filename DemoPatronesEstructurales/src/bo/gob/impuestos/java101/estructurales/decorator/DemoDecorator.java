package bo.gob.impuestos.java101.estructurales.decorator;

public class DemoDecorator  {

    public static void main(String[] args) {
        Figura circulo = new Circulo();
        Figura circuloRojo = new FiguraRojaDecorador(new Circulo());
        Figura rectanguloRojo = new FiguraRojaDecorador(new Rectangulo());
        System.out.println("Circulo normal: ");
        circulo.dibujar();
        System.out.println("---------------------------");
        System.out.println("Circulo con borde rojo: ");
        circuloRojo.dibujar();
        System.out.println("---------------------------");
        System.out.println("Rectangulo con borde rojo: ");
        rectanguloRojo.dibujar();
        System.out.println("---------------------------");
    }

}
