package com.springinaction.common.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;


@Component
public class CDPlayerTemp implements MediaPlayer {


    private CompactDisc cd;


    public CompactDisc getCd() {
        return cd;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public CDPlayerTemp(){
        this.cd = cd;
    }

    @Override
    public void play() {
        System.out.println("cdplayertemp");
        cd.play();
    }

}
