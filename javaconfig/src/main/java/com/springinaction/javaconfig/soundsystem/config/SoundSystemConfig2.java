package com.springinaction.javaconfig.soundsystem.config;

import com.springinaction.common.soundsystem2.CDPlayer2;
import com.springinaction.common.soundsystem2.CompactDisc2;
import com.springinaction.common.soundsystem2.MediaPlayer2;
import com.springinaction.common.soundsystem2.SgtPeppers2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoundSystemConfig2 {

    @Bean
    public CompactDisc2 sgtPeppers2(){
        return new SgtPeppers2();
    }


    @Bean
    public MediaPlayer2 cdPlayer2(){
        return new CDPlayer2(sgtPeppers2());
    }
}
