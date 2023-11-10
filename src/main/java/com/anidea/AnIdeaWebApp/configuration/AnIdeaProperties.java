package com.anidea.AnIdeaWebApp.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "anidea")
public class AnIdeaProperties {

    @Getter
    @Setter
    private Email email;

    @Getter
    @Setter
    private Client client;


    public record Email(
        String username,
        String password,
        String host,
        int port,
        String from
    ){}

    public record Client(String host){}
}
