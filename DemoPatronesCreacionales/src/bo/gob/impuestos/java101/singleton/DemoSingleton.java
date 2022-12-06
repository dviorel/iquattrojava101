package bo.gob.impuestos.java101.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        // ObjetoUnico objeto1 = new ObjetoUnico();
        ObjetoUnico objeto1 = ObjetoUnico.getInstance();
        objeto1.saludar();
        // ObjetoUnico objeto2 = new ObjetoUnico();
        ObjetoUnico objeto2 = ObjetoUnico.getInstance();
        objeto2.saludar();
        System.out.println("Objeto 1: " + objeto1);
        System.out.println("Objeto 2: " + objeto2);
    }

}
