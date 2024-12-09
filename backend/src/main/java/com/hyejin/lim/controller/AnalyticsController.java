package com.hyejin.lim.controller;

import com.hyejin.lim.model.Visit;
import com.hyejin.lim.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analytics") // 방문 기록 관련 엔드포인트는 "/analytics"로 시작
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    /**
     * 방문 기록 추가 또는 업데이트
     * @return 오늘의 방문 기록
     */
    @PostMapping("/record")
    public ResponseEntity<Visit> recordVisit() {
        Visit visit = analyticsService.recordVisit();
        return ResponseEntity.ok(visit);
    }

    /**
     * 모든 방문 기록 조회
     * @return 방문 기록 리스트
     */
    @GetMapping("/all")
    public ResponseEntity<List<Visit>> getAnalytics() {
        List<Visit> visits = analyticsService.getVisitAnalytics();
        return ResponseEntity.ok(visits);
    }
}
