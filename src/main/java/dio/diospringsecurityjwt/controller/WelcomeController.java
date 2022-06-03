package dio.diospringsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome!";
    }
    @GetMapping("/users")
    public String users(){
        return "Authorized User";
    }
    @GetMapping("/managers")
    public String managers(){
        return "Authorized Manager";
    }
}
