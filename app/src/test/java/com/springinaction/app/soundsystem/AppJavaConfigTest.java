package com.springinaction.app.soundsystem;

import com.springinaction.app.config.AppJavaMergeConfig;
import com.springinaction.common.soundsystem.MediaPlayer;
import com.springinaction.common.soundsystem2.MediaPlayer2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppJavaMergeConfig.class)
public class AppJavaConfigTest {

    @Autowired
    @Qualifier("CDPlayer")
    MediaPlayer mediaPlayer;

//    @Autowired
//    MediaPlayer2 mediaPlayer2;

    @Test
    public void appTest(){
        mediaPlayer.play();
        //mediaPlayer2.play();
    }

}
