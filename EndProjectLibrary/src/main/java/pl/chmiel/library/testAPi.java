package pl.chmiel.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAPi {
  @GetMapping("/test1")
  public String test1(){
    return "test1";
  }

  @GetMapping("/test2")
  public String test2(){
    return "test2";
  }

}
