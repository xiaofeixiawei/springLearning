package com.springinaction.xmlconfig.test;

import com.springinaction.common.soundsystem.CDPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoundSystemMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/soundsystem.xml");
       CDPlayer cdPlayer =  applicationContext.getBean(CDPlayer.class);
       cdPlayer.play();
    }

}
