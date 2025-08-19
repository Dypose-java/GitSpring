package ru.dypose.springcore.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("ru.dypose")
@PropertySource("classpath:music.properties")
public class SpringConfig {

}
