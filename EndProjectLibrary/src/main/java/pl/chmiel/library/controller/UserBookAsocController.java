//package pl.chmiel.library.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import pl.chmiel.library.component.Book;
//import pl.chmiel.library.component.User;
//import pl.chmiel.library.repository.BookRepo;
//import pl.chmiel.library.repository.UserRepo;
//
//import java.util.Arrays;
//import java.util.Set;
//
//@Controller
//public class UserBookAsocController {
//
//  @Autowired
//  UserRepo userRepo;
//
//  @Autowired
//  BookRepo bookRepo;
//
//  @GetMapping("/test")
//  public void test() {
//    User testUser11 = new User("testUser1", "test1", "asd", true, "ROLE_USER", null);
//    User testUser22 = new User("testUser2", "test2", "asd", true, "ROLE_USER", null);
//
//    Book book1 = new Book("book1", "book1", 1991);
//    Book book2 = new Book("book2", "book2", 2992);
//
//    bookRepo.saveAll(Arrays.asList(book1, book2));
//    userRepo.saveAll(Arrays.asList(testUser11,testUser22));
//
//    testUser11.getBookSet().add(book1);
//    testUser11.getBookSet().add(book2);
//
//  }
//
//}
