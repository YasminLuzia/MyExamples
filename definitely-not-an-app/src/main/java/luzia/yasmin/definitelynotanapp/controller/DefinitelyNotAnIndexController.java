package luzia.yasmin.definitelynotanapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasmin L
 * @since 29/04/2020 - 20:50
 * @version 1.0
 */
@RestController
public class DefinitelyNotAnIndexController {

    @GetMapping("/")
    public String index(){
        return "Welcome! This is definitely not a system...";
    }

}