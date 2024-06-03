package com.grupo10.autogategrupo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AutogateGrupo10Application {

    public static void main(String[] args) {
        SpringApplication.run(AutogateGrupo10Application.class, args);
    }

}
