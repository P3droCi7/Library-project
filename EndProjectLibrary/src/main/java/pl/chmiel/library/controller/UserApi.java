package pl.chmiel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.chmiel.library.component.User;
import pl.chmiel.library.repository.UserRepo;

@RestController
public class UserApi {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/user")
    public void listUsers(@RequestParam long id, Model model) {
        model.addAttribute("user", userRepo.findById(id));
    }

    @PostMapping("/user")
    public void addUser(@ModelAttribute User user) {
        userRepo.save(user);
    }

}