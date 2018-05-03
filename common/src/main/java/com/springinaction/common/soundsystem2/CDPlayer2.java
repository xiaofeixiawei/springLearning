package com.springinaction.common.soundsystem2;

public class CDPlayer2 implements MediaPlayer2 {

    private CompactDisc2 cd;

    public CDPlayer2(CompactDisc2 cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
