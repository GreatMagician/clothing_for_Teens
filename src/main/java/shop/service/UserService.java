package shop.service;

import org.springframework.stereotype.Service;
import shop.model.User;

/**
 * Created by Alexander on 08.07.2017.
 */
public interface UserService {

    User save(User user);

    User get(Long id);

    User getByEmail(String email);
}
