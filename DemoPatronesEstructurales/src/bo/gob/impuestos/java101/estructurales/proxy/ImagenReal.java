package bo.gob.impuestos.java101.estructurales.proxy;

public class ImagenReal implements Imagen {

    String nombreArchivo;

    public ImagenReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco(nombreArchivo);
    }

    @Override
    public void desplegar() {
        System.out.println("Desplegando imagen real desde " + this.nombreArchivo);
    }

    private void cargarDesdeDisco(String nombreArchivo){
        System.out.println("Cargando desde disco: " + nombreArchivo);
    }
}
