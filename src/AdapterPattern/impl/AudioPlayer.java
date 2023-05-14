package AdapterPattern.impl;

import AdapterPattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    private final String MP3 = "Mp3";
    private MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String format) {
        if (MP3.equals(format)) {
            playMp3();
        } else {
            mediaAdapter.play(format);
        }
    }

    private void playMp3() {
        System.out.println("Play Mp3!");
    }
}
