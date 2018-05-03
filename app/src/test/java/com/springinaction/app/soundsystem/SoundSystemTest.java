package com.springinaction.app.soundsystem;

import com.springinaction.common.soundsystem.MediaPlayer;
import com.springinaction.javaconfig.soundsystem.config.SoundSystemConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {SoundSystemConfig.class})
@ContextConfiguration(locations = "classpath:META-INF/spring/soundsystem.xml")
public class SoundSystemTest {


    @Autowired
    @Qualifier("CDPlayer")
    private MediaPlayer mediaPlayer;


    @Test
    public void tempTest(){
        mediaPlayer.play();
    }

    @Test
    public void tempTest2(){
    }
}
