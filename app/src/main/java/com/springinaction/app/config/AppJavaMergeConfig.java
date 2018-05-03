package com.springinaction.app.config;

import com.springinaction.javaconfig.soundsystem.config.SoundSystemConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration

//@ComponentScan(basePackageClasses = SoundSystemConfig.class)
@ImportResource(locations = "classpath:META-INF/spring/soundsystem.xml")
@Import(SoundSystemConfig.class)
public class AppJavaMergeConfig {

}
