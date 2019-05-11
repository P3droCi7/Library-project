package pl.chmiel.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.chmiel.library.component.User;
import pl.chmiel.library.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/gui")
public class UserController {

    List<User> userList = new ArrayList<>();

    private UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    UserRepo userRepo;

    @GetMapping("/gui")
    public String showGui(Model model) {
        model.addAttribute("user", new User());
        return "gui";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        userDao.save(user);
        return "result";
    }

    @GetMapping("/showallusers")
    public String listUsers(Model model) {
      model.addAttribute("users", userRepo.findAll());
        return "showusers";
    }
}
