package AdapterPattern.impl;

import AdapterPattern.AdvancedMediaPlayer;
import AdapterPattern.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    private final String VLC = "Vlc";
    private final String MP4 = "Mp4";
    private AdvancedMediaPlayer vlcPlayer = new VlcPalyer();
    private AdvancedMediaPlayer mp4Player = new Mp4Player();

    @Override
    public void play(String format) {
        if (VLC.equals(format)) {
            vlcPlayer.playVlc();
        } else if (MP4.equals(format)) {
            mp4Player.playMp4();
        } else {
            throw new RuntimeException("There's no such a format!");
        }
    }
}
