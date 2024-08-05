package com.penguinfactory.kakaologinpj.service;

import com.penguinfactory.kakaologinpj.dto.KakaoUserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class KakaoService {

    @Value("${kakao.client-id}")
    private String clientId;

    @Value("${kakao.client-secret}")
    private String clientSecret;

    @Value("${kakao.redirect-uri}")
    private String redirectUri;

    @Value("${kakao.authorization-uri}")
    private String authorizationUri;

    @Value("${kakao.token-uri}")
    private String tokenUri;

    @Value("${kakao.user-info-uri}")
    private String userInfoUri;

    public String getKakaoAuthUrl() {
        return authorizationUri + "?client_id=" + clientId + "&redirect_uri=" + redirectUri + "&response_type=code";
    }

    public String getAccessToken(String code) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/x-www-form-urlencoded");

        Map<String, String> params = new HashMap<>();
        params.put("grant_type", "authorization_code");
        params.put("client_id", clientId);
        params.put("redirect_uri", redirectUri);
        params.put("code", code);
        params.put("client_secret", clientSecret);

        HttpEntity<Map<String, String>> entity = new HttpEntity<>(params, headers);
        ResponseEntity<Map> response = restTemplate.exchange(tokenUri, HttpMethod.POST, entity, Map.class);

        return (String) response.getBody().get("access_token");
    }

    public KakaoUserDTO getUserInfo(String accessToken) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Map> response = restTemplate.exchange(userInfoUri, HttpMethod.GET, entity, Map.class);

        Map<String, Object> properties = (Map<String, Object>) response.getBody().get("properties");
        Map<String, Object> kakaoAccount = (Map<String, Object>) response.getBody().get("kakao_account");

        KakaoUserDTO userInfo = new KakaoUserDTO();
        userInfo.setId((String) response.getBody().get("id"));
        userInfo.setNickname((String) properties.get("nickname"));

        return userInfo;
    }
}
