package com.hyejin.lim.service;

import com.hyejin.lim.model.Visit;
import com.hyejin.lim.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// 방문 통계 로직을 처리하는 Service 클래스
@Service
public class AnalyticsService {

    @Autowired
    private VisitRepository visitRepository;

    // 오늘의 방문 기록을 추가 또는 업데이트
    public Visit recordVisit() {
        LocalDate today = LocalDate.now();
        Visit visit = visitRepository.findByVisitDate(today).orElse(new Visit());
        if (visit.getId() == null) { // 새 방문 기록 생성
            visit.setVisitDate(today);
            visit.setVisitCount(1);
        } else { // 기존 방문 기록 업데이트
            visit.setVisitCount(visit.getVisitCount() + 1);
        }
        return visitRepository.save(visit);
    }

    // 모든 방문 기록 조회
    public List<Visit> getVisitAnalytics() {
        return visitRepository.findAll();
    }
}
