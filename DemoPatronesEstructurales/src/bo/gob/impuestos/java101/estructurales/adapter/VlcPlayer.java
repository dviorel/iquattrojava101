package bo.gob.impuestos.java101.estructurales.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String rutaArchivo) {
        System.out.println("Reproduciendo el archivo VLC: " + rutaArchivo);
    }

    @Override
    public void playMP4(String rutaArchivo) {
        throw new RuntimeException("MP4 no soportado");
    }
}
