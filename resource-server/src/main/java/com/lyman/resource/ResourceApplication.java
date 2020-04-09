package com.lyman.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyz4455 on 2020/4/2.
 */
@SpringBootApplication
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
public class ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

    @RequestMapping(value = "/api")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String success() {
        return "SUCCESS";
    }
}
