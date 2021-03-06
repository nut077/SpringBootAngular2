package com.nutfreedom.repository;

import com.nutfreedom.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);
    User findByUsername(String username);
}
