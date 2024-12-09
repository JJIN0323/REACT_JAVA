-- 데이터베이스 사용
USE userdb;

-- 사용자 테이블 (기존 테이블 유지)
CREATE TABLE IF NOT EXISTS users (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('USER', 'ADMIN') DEFAULT 'USER'
    );

-- 게시글 테이블 (기존 테이블 유지)
CREATE TABLE IF NOT EXISTS posts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    author_id BIGINT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES users(id) ON DELETE CASCADE
    );

-- 방문 기록 테이블 추가
CREATE TABLE IF NOT EXISTS visits (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    visit_date DATE NOT NULL,
    visit_count INT DEFAULT 1
);
