package com.beyond.university.auth.Controller;

import com.beyond.university.auth.model.mapper.AuthMapper;
import com.beyond.university.auth.model.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class AuthController
{
    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login()
    {
        // 매번 랜덤 한 솔트 값을 가지고 암호화하기 때문에 매번 다른 값으로 암호화한다.
        // System.out.println(passwordEncoder.encode("1234"));
        // System.out.println(passwordEncoder.encode("5678"));

        // matches() 메서드를 사용하면 솔트 값을 뺀 나머지 값과 원문을 비교한다.
        // System.out.println(passwordEncoder.matches("1234", "$2a$10$0/M2oY8/GRgngy9QVlC3RuRvkhB7ZgVb73Uq/gSXut6r1nTBvL4/S"));

        log.info("로그인 페이지 요청");

        return "auth/login";
    }

    @GetMapping("/accessDenied")
    public ModelAndView accessDenied(ModelAndView modelAndView, Model model)
    {
        log.info("권한 오류 페이지 요청");

        modelAndView.addObject("msg", "접근 권한이 없습니다.");
        modelAndView.addObject("location", "/");
        modelAndView.setViewName("common/msg");

        return modelAndView;
    }

    @GetMapping("/admin/info")
    public String adminInfo()
    {
        log.info("관리자 페이지 요청");

        return "admin/info";
    }

    // 컨트롤러에서 인증된 사용자 정보를 가져오는 방법
    @GetMapping("/user/info")
    // 1. SecurityContextHolder를 사용하는 방법
    //public String userInfo()
    // 2. Authentication 객체를 컨트롤러 메서드의 매개변수로 가져오는 방법
    // public String userInfo(Authentication authentication)
    // 3. @AuthenticationPrincipal 어노테이션을 사용하는 방법
    public String userInfo(@AuthenticationPrincipal User loginUser)
    {
        log.info("사용자 페이지 요청");
        
        // 1. SecurityContextHolder를 사용하는 방법
        // SecurityContext context = SecurityContextHolder.getContext();
        // Authentication authentication = context.getAuthentication();
        // User loginUser = (User) authentication.getPrincipal();
        
        System.out.println(loginUser);

        return "user/info";
    }
}
