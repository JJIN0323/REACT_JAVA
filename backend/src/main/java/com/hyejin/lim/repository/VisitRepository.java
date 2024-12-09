package com.hyejin.lim.repository;

import com.hyejin.lim.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

// 방문 기록 데이터베이스 작업을 위한 Repository
@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
    // 특정 날짜의 방문 기록을 검색하는 메서드
    Optional<Visit> findByVisitDate(LocalDate visitDate);
}
