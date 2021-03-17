package com.unlimint.test.javadev.parsefile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ParseFileApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ParseFileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (String str : args) {
            System.out.println(str);
        }
    }
}
