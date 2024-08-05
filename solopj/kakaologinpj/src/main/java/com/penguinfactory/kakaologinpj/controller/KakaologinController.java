package com.penguinfactory.kakaologinpj.controller;

import com.penguinfactory.kakaologinpj.dto.KakaoUserDTO;
import com.penguinfactory.kakaologinpj.service.KakaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaologinController {

    @Autowired
    private KakaoService kakaoService;

    @GetMapping("/login")
    public String login() {
        String kakaoAuthUrl = kakaoService.getKakaoAuthUrl();
        return "redirect:" + kakaoAuthUrl;
    }

    @GetMapping("/oauth/kakao/callback")
    public String callback(@RequestParam String code, Model model) {
        String accessToken = kakaoService.getAccessToken(code);
        KakaoUserDTO userInfo = kakaoService.getUserInfo(accessToken);
        model.addAttribute("user", userInfo);
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
