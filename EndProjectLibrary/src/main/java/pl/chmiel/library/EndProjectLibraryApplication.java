package pl.chmiel.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndProjectLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndProjectLibraryApplication.class, args);
    }

    //TODO: dodac strone startowa, wybor ksiazek, usowanie uzytkownika, usowanie dodawanie ksiazek

    //TODO: Security, logowanie dla uzytkownika, admin ma dostep do innego endpointu niz user
    //TODO: przypisanie ile i jakie ksiazki posiada dany user (<=5)

    //Dodano Swagger2, Dokumentacja dostępna pod adresem: http://localhost:8080/swagger-ui.html

}
