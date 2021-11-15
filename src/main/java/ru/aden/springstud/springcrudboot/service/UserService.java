package ru.aden.springstud.springcrudboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aden.springstud.springcrudboot.model.User;
import ru.aden.springstud.springcrudboot.repository.UserRepositroy;

import java.util.List;

@Service
public class UserService {

    private final UserRepositroy userRepositroy;

    @Autowired
    public UserService(UserRepositroy userRepositroy) {
        this.userRepositroy = userRepositroy;
    }

    public User findById(Long id) {
        return userRepositroy.getOne(id);
    }

    public List<User> findAll() {
        return userRepositroy.findAll();
    }

    public User saveUser(User user) {
        return userRepositroy.save(user);
    }

    public void deleteById(Long id) {
        userRepositroy.deleteById(id);
    }
}
