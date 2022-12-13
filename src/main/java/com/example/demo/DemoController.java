package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

        @GetMapping(value = "/hello")
        public String sayHelloWorld() {
            return "Hello Your War file is deployed successfully";
        }

    @GetMapping(value = "/deployment")
    public String deployment() {
        return "You have deployed your war package and it is up and running";
    }


}