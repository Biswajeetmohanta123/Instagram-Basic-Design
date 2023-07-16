package com.geekster.Instagram.repo;

import com.geekster.Instagram.models.AuthenticationToken;
import com.geekster.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByUser(User user);

    AuthenticationToken findFirstByToken(String token);
}
