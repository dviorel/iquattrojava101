package bo.gob.impuestos.java101.estructurales.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String tipoAudio, String rutaArchivo) {
        if (tipoAudio.equals("mp3")){
            System.out.println("Reproduciendo mp3 desde: " + rutaArchivo);
        }
        else if (tipoAudio.equals("vlc") || tipoAudio.equals("mp4")){
            mediaAdapter = new MediaAdapter(tipoAudio);
            mediaAdapter.play(tipoAudio, rutaArchivo);
        }
        else{
            System.out.println("Formato " +tipoAudio + " no soportado");
        }
    }
}
