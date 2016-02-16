package com.aleshka.config;

import com.aleshka.domain.ItemA;
import com.aleshka.domain.ItemB;
import com.aleshka.domain.Sendable;
import com.aleshka.domain.Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.aleshka.domain")
public class AppConfig
{

    @Bean
    public Sender sender() {
        return new Sender();
    }

    @Bean
    public Sendable sendable() {
        return new ItemB();
    }
}
