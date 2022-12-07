package bo.gob.impuestos.java101.estructurales.proxy;

public class DemoProxy {

    public static void main(String[] args) {
        ImagenProxy imagenProxy = new ImagenProxy("uno.mp4");
        imagenProxy.desplegar();
        imagenProxy.desplegar();

    }

}
