package com.example.myhelloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public com.example.myhelloworld.HelloWorldBean helloWorldBean() {
        // throw new RuntimeException("Some Error has Happened! Contact Support at
        // ***-***");
        return new com.example.myhelloworld.HelloWorldBean("Hello World");
    }

    /// hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public com.example.myhelloworld.HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new com.example.myhelloworld.HelloWorldBean(String.format("Hello World, %s", name));
    }
}
