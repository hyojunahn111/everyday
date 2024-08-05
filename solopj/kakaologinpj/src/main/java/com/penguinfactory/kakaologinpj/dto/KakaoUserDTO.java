package com.penguinfactory.kakaologinpj.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class KakaoUserDTO {

    private String id;
    private String nickname;

    public KakaoUserDTO(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }
}
