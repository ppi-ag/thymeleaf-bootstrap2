package de.ppi.fuwesta.thymeleaf.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.ppi.fuwesta.thymeleaf.bootstrap2.Bootstrap2Dialect;

@Configuration
public class Bootstrap2DialectConfig {

    @Bean
    public Bootstrap2Dialect bootstrap2Dialect() {
        return new Bootstrap2Dialect();
    }

}
