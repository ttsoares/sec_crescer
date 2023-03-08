package authentication.authentication.modules.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.authentication.modules.user.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, UUID> {

  User findByUsername(String username);

  @Query("SELECT u from User u JOIN FETCH u.roles where u.username = :username")
  User findByYsernameFetchRoles(@Param("username") String username);

}
