package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import shop.model.User;
import shop.repository.UserRepository;

/**
 * Created by Alexander on 08.07.2017.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User save(User user) {
        Assert.notNull(user, "user не должен быть null");
        return repository.save(user);
    }

    @Override
    public User get(Long id) {
        return repository.findOne(id);
    }

    @Override
    public User getByEmail(String email) {
        Assert.notNull(email, "email не должен быть null");
        return repository.findByEmail(email);
    }
}
