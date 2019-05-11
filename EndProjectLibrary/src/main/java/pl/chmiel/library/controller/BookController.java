package pl.chmiel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.chmiel.library.component.Book;
import pl.chmiel.library.repository.BookRepo;

@Controller
//@RequestMapping("/gui")
public class BookController {


    @Autowired
    BookRepo bookRepo;

    @GetMapping("/bookgui")
    public String showGui(Model model) {
        model.addAttribute("book", new Book());
        return "bookgui";
    }

    @PostMapping("/addbook")
    public String addBook(@ModelAttribute Book book, Model model) {
        bookRepo.save(book);
        return showAllBooks(model);
    }

    private String showAllBooks(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "showbooks";
    }

//    @GetMapping("/showallusers")
//    public String listUsers(Model model) {
//      model.addAttribute("users", userRepo.findAll());
//        return "showusers";
//    }
}
