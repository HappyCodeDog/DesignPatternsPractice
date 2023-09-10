package StructuralPattern.AdapterPattern.impl;

import StructuralPattern.AdapterPattern.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4() {
        System.out.println("Play Mp4!");
    }

    @Override
    public void playVlc() {

    }
}
