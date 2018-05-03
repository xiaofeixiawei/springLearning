package com.springinaction.common.soundsystem2;

public class SgtPeppers2 implements CompactDisc2 {

    private String title = "Sgt2. pepper's Lonely Hearts Club band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
