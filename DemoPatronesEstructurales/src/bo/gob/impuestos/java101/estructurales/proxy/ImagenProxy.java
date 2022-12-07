package bo.gob.impuestos.java101.estructurales.proxy;

public class ImagenProxy implements Imagen {
    String nombreArchivo;

    ImagenReal imagenReal;

    public ImagenProxy(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.imagenReal = new ImagenReal(nombreArchivo);
    }

    @Override
    public void desplegar() {
//        System.out.println("Desplegando imagen haciendo uso del proxy");
        imagenReal.desplegar();
    }
}
