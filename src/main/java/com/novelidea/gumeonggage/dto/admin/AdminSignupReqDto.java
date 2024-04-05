package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Admin;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
public class AdminSignupReqDto {

//    @Pattern(regexp = "^[A-Za-z0-9]{4,10}$", message = "영문자, 숫자 5 ~ 10자리 형식이어야 합니다")
    private String username;
//    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{7,128}$",message = "영문자, 숫자, 특수문자를 포함한 5  5 ~ 128자리 형식이어야 합니다")
    private String password;
//    @Pattern(regexp = "^[가-힇]{1,}$",message = "한글문자 형식이어야 합니다")
    private String name;
//    @Email(regexp = "^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{1,3}$",message = "이메일 형식이어야합니다") //0314-2
    private String email;

    public Admin toEntity(BCryptPasswordEncoder passwordEncoder){
        return Admin.builder()
                .adminName(username)
                .adminPassword(passwordEncoder.encode(password))
                .name(name)
                .email(email)
                .build();
    }

}
