package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@PropertySource("classpath:/applications.properties")
@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public ExpressionParser resolver() {
        return new SpelExpressionParser();
    }
}
