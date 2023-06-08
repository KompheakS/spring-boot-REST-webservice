package net.java.springbootrestfulwebservice.repository;

import net.java.springbootrestfulwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
