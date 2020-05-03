package luzia.yasmin.ExampleHelloWorld.controller;

import luzia.yasmin.ExampleHelloWorld.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:05
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Hello world!";
    }

}
