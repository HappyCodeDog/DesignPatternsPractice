package AdapterPattern;

import AdapterPattern.impl.AudioPlayer;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("Mp3");
        mediaPlayer.play("Mp4");
        mediaPlayer.play("Vlc");
    }
}
