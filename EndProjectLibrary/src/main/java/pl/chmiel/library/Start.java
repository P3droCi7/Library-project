package pl.chmiel.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/addbook")
    public Book saveBook() {
        Book book = new Book("Test title", "Test author", 1998);
        bookRepo.save(book);
        return book;
    }

    @GetMapping("/showbooks")
    public Iterable<Book> showBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/adduser")
    public User saveUser() {
        User user = new User("Janusz", "Kowalski", 23);
        userRepo.save(user);
        return user;
    }

    @GetMapping("/showusers")
    public Iterable<User> showUsers(){
        return userRepo.findAll();
    }
}

