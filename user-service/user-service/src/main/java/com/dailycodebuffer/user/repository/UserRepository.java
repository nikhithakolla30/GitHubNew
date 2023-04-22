package com.dailycodebuffer.user.repository;

import com.dailycodebuffer.user.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User1,Long> {
    User1 findByUserId(Long userId);
}
