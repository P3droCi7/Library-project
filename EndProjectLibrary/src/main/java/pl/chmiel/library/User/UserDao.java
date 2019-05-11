package pl.chmiel.library.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getUser(long id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{id});
    }

    public void save(User user) {
        String sql = "INSERT INTO user VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]
                {user.getId(),
                        user.getAge(),
                        user.getName(),
                        user.getLastname()
                });
    }

    public Object showall(User user) {
        String sql = "SELECT * FROM user";
        jdbcTemplate.update(sql, new Object[]
                {user.getId(),
                        user.getAge(),
                        user.getName(),
                        user.getLastname()
                });
        return user;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void dbInit() {

    }
}