package com.hyejin.lim.repository;

import com.hyejin.lim.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// User 테이블과의 데이터베이스 작업을 위한 Repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // username으로 사용자를 검색하는 메서드 선언
    Optional<User> findByUsername(String username);
}
