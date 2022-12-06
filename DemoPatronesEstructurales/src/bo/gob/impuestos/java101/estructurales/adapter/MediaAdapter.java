package bo.gob.impuestos.java101.estructurales.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String tipoAudio) {
        if (tipoAudio.equals("vlc")){
            this.advancedMediaPlayer = new VlcPlayer();
        }
        else if (tipoAudio.equals("mp4")){
            this.advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String tipoAudio, String rutaArchivo) {
        if (tipoAudio.equals("vlc")){
            this.advancedMediaPlayer.playVlc(rutaArchivo);
        }
        else if (tipoAudio.equals("mp4")){
            this.advancedMediaPlayer.playMP4(rutaArchivo);
        }
    }
}
