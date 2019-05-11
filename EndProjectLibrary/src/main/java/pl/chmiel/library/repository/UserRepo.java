package pl.chmiel.library.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.chmiel.library.User.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
