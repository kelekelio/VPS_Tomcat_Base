package com.grzegorznowakowski.vps_tomcat_base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VpsTomcatBaseApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VpsTomcatBaseApplication.class, args);
    }

}
