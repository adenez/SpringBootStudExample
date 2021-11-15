package ru.aden.springstud.springcrudboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aden.springstud.springcrudboot.model.User;

public interface UserRepositroy extends JpaRepository<User, Long> {

}
