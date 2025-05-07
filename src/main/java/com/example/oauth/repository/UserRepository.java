package com.example.oauth.repository;

import com.example.oauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // Métodos personalizados pueden ser agregados aquí si se necesitan
}
