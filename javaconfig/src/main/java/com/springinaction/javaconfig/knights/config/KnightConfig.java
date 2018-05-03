package com.springinaction.javaconfig.knights.config;

import com.springinaction.common.knights.BraveKnight;
import com.springinaction.common.knights.Knight;
import com.springinaction.common.knights.Quest;
import com.springinaction.common.knights.SlaryDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlaryDragonQuest(System.out);
    }

}
