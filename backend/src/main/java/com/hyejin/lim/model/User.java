package com.hyejin.lim.model;

import jakarta.persistence.*;

// User 엔티티 클래스 정의
@Entity
@Table(name = "users") // 테이블 이름을 "users"로 설정
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키를 자동 생성
    private Long id;

    @Column(nullable = false, unique = true) // 필수 값이며 고유 값 설정
    private String username;

    @Column(nullable = false) // 필수 값 설정
    private String password;

    // Getter와 Setter 메서드 정의
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
