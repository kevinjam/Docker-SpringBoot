package com.kevinjanvier.docker.dockerkubernet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AxonController {

    @RequestMapping("/")
    public String axonHello(){
        return "Hello Axon Server";
    }
}
