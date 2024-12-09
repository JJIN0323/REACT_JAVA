package com.hyejin.lim.model;

import jakarta.persistence.*;
import java.time.LocalDate;

// 방문 기록(Visit) 엔티티 정의
@Entity
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 자동 생성
    private Long id;

    @Column(name = "visit_date", nullable = false) // 방문 날짜
    private LocalDate visitDate;

    @Column(name = "visit_count", nullable = false) // 방문 횟수
    private int visitCount;

    // Getter와 Setter 메서드
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
