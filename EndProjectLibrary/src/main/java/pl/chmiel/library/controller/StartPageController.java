package pl.chmiel.library.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Date;

@Controller
public class StartPageController {

//    @GetMapping("/index")
//    private String index(Principal principal) {
//        return "index";
//    }
@GetMapping("/index")
public String test(Model model) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String name = auth.getName(); //get logged in username

    model.addAttribute("serverTime", (new Date()));
    model.addAttribute("name", name);
    return "index";
}
}
