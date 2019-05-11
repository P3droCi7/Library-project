package pl.chmiel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.chmiel.library.component.Book;
import pl.chmiel.library.component.User;
import pl.chmiel.library.repository.BookRepo;
import pl.chmiel.library.repository.UserRepo;

@RestController
public class BookApi {

    @Autowired
    BookRepo bookRepo;

    @GetMapping("/book")
    public void listBooks(@RequestParam long id, Model model) {
        model.addAttribute("book", bookRepo.findById(id));
    }

    @PostMapping("/book")
    public void addBook(@ModelAttribute Book book) {
        bookRepo.save(book);
    }

}