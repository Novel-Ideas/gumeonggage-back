package com.novelidea.gumeonggage.aop;

import com.novelidea.gumeonggage.aop.annotation.ValidAspect;
import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.dto.admin.OAuth2.OAuth2SignupReqDto;
import com.novelidea.gumeonggage.exception.ValidException;
import com.novelidea.gumeonggage.repository.AdminMapper;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Aspect
public class ValidAop {
    @Autowired
    private AdminMapper adminMapper;

    @Pointcut("@annotation(com.novelidea.gumeonggage.aop.annotation.ValidAspect)")
    private void pointCut() {}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        BeanPropertyBindingResult bindingResult = null;

        for(Object arg : args) {
            if(arg.getClass() == BeanPropertyBindingResult.class) {
                bindingResult =(BeanPropertyBindingResult) arg;
            }
        }

        if(methodName.equals("adminSignup")) {
            AdminSignupReqDto adminSignupReqDto = null;

            for(Object arg : args) {
                if(arg.getClass() == AdminSignupReqDto.class) {
                    adminSignupReqDto =(AdminSignupReqDto) arg;
                }
            }
            if(adminMapper.findAdminByUsername(adminSignupReqDto.getUsername()) != null) {
                ObjectError objectError = new FieldError("username", "username", "이미 존재하는 사용자이름입니다");
                bindingResult.addError(objectError);
            }
        }
        if(methodName.equals("oAuth2Signup")) {
            OAuth2SignupReqDto oAuth2SignupReqDto = null;

            for(Object arg : args) {
                if(arg.getClass() == OAuth2SignupReqDto.class) {
                    oAuth2SignupReqDto  = (OAuth2SignupReqDto) arg;
                }
            }
            if(adminMapper.findAdminByOAuth2name(oAuth2SignupReqDto.getUsername()) != null) {
                ObjectError objectError = new FieldError("username", "username", "이미 존재하는 사용자이름입니다");
                bindingResult.addError(objectError);
            }
        }

        if(bindingResult.hasErrors()) { //유효성 검사
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, String> errorMap = new HashMap<>();
            for (FieldError fieldError : fieldErrors) {
                String fieldName = fieldError.getField(); // dto변수명
                String message = fieldError.getDefaultMessage(); // 메세지내용
                errorMap.put(fieldName,message);
            }

            throw new ValidException(errorMap);
        }
        return proceedingJoinPoint.proceed();
    }

}


