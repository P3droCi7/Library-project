//package pl.chmiel.library.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import pl.chmiel.library.component.Book;
//import pl.chmiel.library.component.User;
//import pl.chmiel.library.repository.BookRepo;
//import pl.chmiel.library.repository.UserRepo;
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
////    Book book1 = new Book("book1", "book1", 1991);
////    Book book2 = new Book("book2", "book2", 2992);
//
////    User testUser11 = new User("testUser1", "$04$CO93CT2ObgMiSnMAWwoBkeFObJlMYi/wzzOnPlsTP44r7qVq0Jln2", "asd", true, "ROLE_USER", null);
////    User testUser22 = new User("testUser2", "$04$CO93CT2ObgMiSnMAWwoBkeFObJlMYi/wzzOnPlsTP44r7qVq0Jln2", "asd", true, "ROLE_USER", null);
//
////    userRepo.findById((long) 1).get().getBookSet().add(bookRepo.findById(1).get());
////    userRepo.save(userRepo.findById((long) 1));
//
//    Book bookInDB = bookRepo.findById((long) 1).get();
//    User userInDB = userRepo.findById((long) 1).get();
//    userInDB.getBookSet().add(bookInDB);
//    userRepo.save(userInDB);
//
////
////    book1.getUserSet().add(testUser11);
////    book2.getUserSet().add(testUser22);
//
////    this.userRepo.save(testUser11);
////    this.userRepo.save(testUser22);
//
////
////    bookRepo.saveAll(Arrays.asList(book1, book2));
//////    userRepo.saveAll(Arrays.asList(testUser11,testUser22));
////Set<Book> bookSet = new Set<Book>();
////
////    userRepo.findById((long) 1).get().getBookSet().add(book1);
//
////    userRepo.findById((long) 1).get().getBookSet().add(book1);
////    bookRepo.findById(1);
////
////    userRepo.findById((long) 1)
////    testUser11.getBookSet().add(book1);
////    testUser11.getBookSet().add(book2);
//
//
//
//  }
//
//}
