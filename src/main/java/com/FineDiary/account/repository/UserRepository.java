package com.FineDiary.account.repository;

import com.FineDiary.account.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    Users findbyEmail (String email);
}
