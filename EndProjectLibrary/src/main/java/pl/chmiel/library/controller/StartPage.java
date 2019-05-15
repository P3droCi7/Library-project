package pl.chmiel.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class StartPage {

    @GetMapping("/index")
    private String index(Principal principal) {
        return "index";
    }
}
