package com.springinaction.javaconfig.soundsystem.config;

import com.springinaction.common.soundsystem.CompactDisc;
import com.springinaction.common.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springinaction.common.soundsystem")
public class SoundSystemConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers("luhui", "love");
    }
}
