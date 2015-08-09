package de.ppi.fuwesta.thymeleaf.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.ppi.fuwesta.thymeleaf.bootstrap2.Bootstrap2Dialect;

/**
 * Autoconfiguration for Spring-boot.
 * @author niels
 *
 */
@Configuration
public class Bootstrap2DialectConfig {

    /**
     * Create the {@link Bootstrap2Dialect}.
     * @return the {@link Bootstrap2Dialect}.
     */
    @Bean
    public Bootstrap2Dialect bootstrap2Dialect() {
        return new Bootstrap2Dialect();
    }

}
