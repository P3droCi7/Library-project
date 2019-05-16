package pl.chmiel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.chmiel.library.component.Book;
import pl.chmiel.library.repository.BookRepo;

import java.util.Optional;

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

    @GetMapping("/bookprofile")
    private String bookProfile(@RequestParam("bookId") Integer theId) {
        bookRepo.findById(theId).orElseThrow(null);
        return "bookprofile";
    }

    @GetMapping("/showallbooks")
    private String showAllBooks(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "showbooks";
    }

    @PostMapping("/addbook")
    public String addBook(@ModelAttribute Book book, Model model) {
        bookRepo.save(book);
        return showAllBooks(model);
    }

    @GetMapping("/updatebook")
    private String updateBook(@RequestParam("bookId") int theId, Model model) {
        Optional<Book> theBook = bookRepo.findById(theId);
        model.addAttribute("book", theBook);
        return "redirect:/bookgui";
    }

    @GetMapping("/deletebook")
    private String deleteBook(@RequestParam("bookId") int theId) {
        bookRepo.deleteById(theId);
        return "redirect:/showallbooks";
    }

}
