package com.springinaction.common.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "taichangwei";
    private String artist = "i love you";

    @Autowired
    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public SgtPeppers() {
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
