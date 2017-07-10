package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.User;

/**
 * Created by Alexander on 08.07.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
