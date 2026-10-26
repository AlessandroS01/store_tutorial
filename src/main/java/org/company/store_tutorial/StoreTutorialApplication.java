package org.company.store_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class StoreTutorialApplication {

    static void main(String[] args) {
        // COnfiguration of dotenv-java
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

        // Add properties to System.properties
        dotenv.entries().forEach(env -> {
            System.setProperty(env.getKey(), env.getValue());
        });

        SpringApplication.run(StoreTutorialApplication.class, args);
    }

}
