package bo.gob.impuestos.java101.estructurales.adapter;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String rutaArchivo) {
        throw new RuntimeException("VLC no soportado");
    }

    @Override
    public void playMP4(String rutaArchivo) {
        System.out.println("Reproduciendo el archivo MP4: " + rutaArchivo);
    }
}
