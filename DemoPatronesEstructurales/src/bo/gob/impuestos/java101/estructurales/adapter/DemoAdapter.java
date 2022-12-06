package bo.gob.impuestos.java101.estructurales.adapter;

public class DemoAdapter {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "archivo.mp3");
        audioPlayer.play("mp4", "archivo.mp4");
        audioPlayer.play("vlc", "archivo.vlc");
        audioPlayer.play("avi", "archivo.avi");
    }

}
