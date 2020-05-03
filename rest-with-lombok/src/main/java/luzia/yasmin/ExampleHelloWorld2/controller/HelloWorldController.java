package luzia.yasmin.ExampleHelloWorld2.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:44
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Hello World!";
    }
}
