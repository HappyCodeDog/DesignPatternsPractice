package AdapterPattern.impl;

import AdapterPattern.AdvancedMediaPlayer;

public class VlcPalyer implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("Play VLC!");
    }

    @Override
    public void playMp4() {

    }
}
