package aleks.aleks.repositories;

import aleks.aleks.orm.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface test extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u where u.login=?1")
    User FindUser(String login);

    User findBylogin(String login);

    User findById(int id);



}
