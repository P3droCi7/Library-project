package pl.chmiel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.chmiel.library.component.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {
}
