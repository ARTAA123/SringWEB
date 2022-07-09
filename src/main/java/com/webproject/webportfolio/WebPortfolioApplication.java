package com.webproject.webportfolio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.util.Arrays;

@SpringBootApplication
public class WebPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebPortfolioApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect the beans provided by spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);

            for(String beanName: beanNames){
                System.out.println(beanName);
            }
        };
    }

}
