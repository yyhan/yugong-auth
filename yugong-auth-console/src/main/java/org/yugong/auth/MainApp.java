package org.yugong.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:/application.properties",
        "classpath:/freemarker.properties"})
@SpringBootApplication
@MapperScan(basePackages = {"org.yugong.auth.dao.generate", "org.yugong.auth.dao.customize"})
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}
