package com.greentime.backend.repositories;

import com.greentime.backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}