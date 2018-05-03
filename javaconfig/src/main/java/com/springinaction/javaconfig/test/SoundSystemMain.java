package com.springinaction.javaconfig.test;

import com.springinaction.common.soundsystem.CDPlayer;
import com.springinaction.javaconfig.soundsystem.config.SoundSystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoundSystemMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);

        cdPlayer.play();
    }

}


