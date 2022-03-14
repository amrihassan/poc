package com.sncf.conf;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("amrihassan@gmail.com");
        contact.setName("AMRI");
        OpenAPI openApi = new OpenAPI().components(new Components())
                .info(new Info().title("POC Application API").version("1.0.0").contact(contact)
                        .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                );
        return openApi;
    }

}
