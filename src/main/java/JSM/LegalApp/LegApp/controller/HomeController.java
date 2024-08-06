package JSM.LegalApp.LegApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Devolver el nombre de la plantilla sin la extensión .html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Devolver el nombre de la plantilla sin la extensión .html
    }

    @GetMapping("/index")
    public String index() {
        return "index"; // Devolver el nombre de la plantilla sin la extensión .html
    }

    
    // @GetMapping("/register")
    // public String register() {
    //     return "register"; // Devolver el nombre de la plantilla sin la extensión .html
    // }
}
