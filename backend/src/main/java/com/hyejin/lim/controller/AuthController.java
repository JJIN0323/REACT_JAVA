package com.hyejin.lim.controller;

// 필요한 클래스들을 import
import com.hyejin.lim.model.User;
import com.hyejin.lim.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 이 클래스가 REST 컨트롤러임을 선언
@RequestMapping("/auth") // 모든 엔드포인트가 "/auth"로 시작하도록 설정
public class AuthController {

    @Autowired // Spring이 AuthService 객체를 자동으로 주입하도록 설정
    private AuthService authService;

    /**
     * 회원가입 엔드포인트
     * @param username 사용자 이름 (HTTP 요청에서 전달됨)
     * @param password 비밀번호 (HTTP 요청에서 전달됨)
     * @return 회원가입 성공/실패 메시지
     */
    @PostMapping("/register") // HTTP POST 요청을 처리하고 "/auth/register"에 매핑
    public ResponseEntity<?> register(@RequestParam String username, @RequestParam String password) {
        try {
            // AuthService를 호출하여 회원가입 로직 처리
            User user = authService.register(username, password);
            // 성공적으로 저장된 사용자 이름과 함께 응답 반환
            return ResponseEntity.ok("User registered successfully: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            // 사용자 이름이 중복되었거나 기타 문제 발생 시 에러 메시지 반환
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    /**
     * 로그인 엔드포인트
     * @param username 사용자 이름 (HTTP 요청에서 전달됨)
     * @param password 비밀번호 (HTTP 요청에서 전달됨)
     * @return 로그인 성공 시 환영 메시지, 실패 시 401 상태 코드
     */
    @PostMapping("/login") // HTTP POST 요청을 처리하고 "/auth/login"에 매핑
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        // AuthService를 호출하여 로그인 처리
        return authService.login(username, password)
                // 로그인 성공 시 사용자 이름과 함께 환영 메시지를 반환
                .map(user -> ResponseEntity.ok("Welcome, " + user.getUsername()))
                // 로그인 실패 시 HTTP 401 상태 코드와 에러 메시지 반환
                .orElse(ResponseEntity.status(401).body("Invalid credentials"));
    }

    /**
     * 로그아웃 엔드포인트
     * @return 로그아웃 성공 메시지
     */
    @PostMapping("/logout") // HTTP POST 요청을 처리하고 "/auth/logout"에 매핑
    public ResponseEntity<?> logout() {
        // 로그아웃은 주로 클라이언트에서 토큰이나 세션을 삭제하여 처리
        // 서버 측에서는 성공 메시지만 반환
        return ResponseEntity.ok("Logged out successfully");
    }
}
