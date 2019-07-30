package com.test.demoview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.test"})
@EntityScan("com.test.demodata.entity")
@EnableJpaRepositories("com.test.demodata.repository")
public class DemoViewApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoViewApplication.class, args);

    }

}
