package pl.chmiel.library.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserApi {

    private UserDao userDao;

    @Autowired
    public UserApi(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/user")
    public List<Map<String, Object>> addUser(@RequestParam long id) {
        return userDao.getUser(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userDao.save(user);
    }
}