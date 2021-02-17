package com.cortech.soft.cortech;

import com.cortech.soft.cortech.seeder.ApplicationSeed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CortechApplication implements CommandLineRunner {
@Autowired
private ApplicationSeed applicationSeed;

    public static void main(String[] args) {
        SpringApplication.run(CortechApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      applicationSeed.seed();
    }
}
