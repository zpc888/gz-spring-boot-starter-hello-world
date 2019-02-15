package com.prot.poc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CustomSpringStarter implements CommandLineRunner {
    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringStarter.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = greeter.greet();
        log.debug("=== Greeting Message === " + message);
    }
}
