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


    @GetMapping(value = "/bilal")
    public String bilal() {
        return "Hello Bilal!";
    }


    @GetMapping(value = "/waqas")
    public String bilal() {
        return "Hello Waqas & Salman!";
    }

    @GetMapping(value = "/QA")
    public String quality() {
        return "QA Testiing Enviornment!";
    }

    @GetMapping(value = "/waqas")
    public String waqas() {
        return "waqas here!";
    }

    @GetMapping(value = "/hellobello")
    public String hellobello() {
        return "Hello Bello! How are you doing!";
    }

    @GetMapping(value = "/zeeshan")
    public String Zeeshan() {
        return "Hello Zeeshan! What are you doing!";
    }


}