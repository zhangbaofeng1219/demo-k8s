package com.zbf.demo.demok8s;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@SpringBootApplication
public class DemoK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoK8sApplication.class, args);
    }


    @GetMapping("/demo/test")
    public String test(String name) {
        log.info("param:{}", name);
        return "SUC:" + name;
    }

}
