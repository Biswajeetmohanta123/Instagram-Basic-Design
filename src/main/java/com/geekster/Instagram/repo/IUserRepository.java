package com.geekster.Instagram.repo;

import com.geekster.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    Boolean existsByEmail(String email);

    User findFirstByEmail(String userEmail);
}
