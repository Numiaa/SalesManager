package ru.ivanov.salesmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivanov.salesmarket.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
