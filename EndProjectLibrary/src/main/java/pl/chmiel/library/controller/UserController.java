package pl.chmiel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.chmiel.library.component.Book;
import pl.chmiel.library.component.User;
import pl.chmiel.library.repository.BookRepo;
import pl.chmiel.library.repository.UserRepo;

@Controller
//@RequestMapping("/gui")
public class UserController {


    @Autowired
    UserRepo userRepo;
    @Autowired
    BookRepo bookRepo;

    @GetMapping("/usergui")
    public String showGui(Model model) {
        model.addAttribute("user", new User());
        return "usergui";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute User user, Model model) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        userRepo.save(user);
        return showAllUsers(model);
    }

    private String showAllUsers(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "showusers";
    }

    @GetMapping("/borrowbook")
    public String borrowBook(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        if(name != "anonymousUser"){
          //  userRepo.findByUserName(name).setBookSet(bookRepo.findById(1));
        }
        return "Success";
    }


//    @GetMapping("/showallusers")
//    public String listUsers(Model model) {
//      model.addAttribute("users", userRepo.findAll());
//        return "showusers";
//    }
}
