package cn.edu.scnu.controller;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.RestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;
//    @RequestMapping("hello")
    public String sayHello(String name){
        return "hello"+name+",i am from" + port;
    }
}
