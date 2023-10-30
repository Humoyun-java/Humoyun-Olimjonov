package humoyun.olimjonov.appgitproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/first")
    public String firstMethod(){
        return "First method";
    }

    @GetMapping("/second")
    public String secondMethod(){
        return "Second method";
    }

    @GetMapping("/third")
    public String thirdMethod(){
        return "Third method";
    }

    @GetMapping("/forth")
    public String forthMethod(){
        return "Forth method";
    }

    @GetMapping("/fifth")
    public String fifthMethod(){
        return "Fifth method";
    }
}