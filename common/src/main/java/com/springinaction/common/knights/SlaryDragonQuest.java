package com.springinaction.common.knights;

import java.io.PrintStream;

public class SlaryDragonQuest implements Quest {

    private PrintStream stream;

    public SlaryDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");

    }
}
