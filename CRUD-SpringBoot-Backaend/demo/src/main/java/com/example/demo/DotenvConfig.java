package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotenvConfig {
    @Bean
    public Dotenv dotenv() {
        // Carga el archivo .env ubicado en la raíz del proyecto
        return Dotenv.configure().directory("/home/jesus/Documentos/java/my-app/CRUD-SpringBoot-Backaend/demo/").load();
    }
}
