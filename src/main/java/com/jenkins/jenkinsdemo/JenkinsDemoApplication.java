package com.jenkins.jenkinsdemo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
// Adding comment for second commit 

@SpringBootApplication
public class JenkinsDemoApplication {

    public static Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started....");
    }

    public static void main(String[] args) {
        logger.info("Application executed....");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
