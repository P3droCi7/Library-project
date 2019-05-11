package pl.chmiel.library.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.chmiel.library.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
}
