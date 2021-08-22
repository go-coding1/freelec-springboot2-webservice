package com.jojoldu.book.springboot.config;

import com.jojoldu.book.springboot.config.auth.LoginUserArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/*
생성된 LoginUserArgumentsResolver가 스프링에서 인식될 수 있도록 WebMvcConfigurer에 추가하겠습니다.

HandlerMethodArgumentResolver는 항상 WebMvcConfigurer의 addArugmentResolvers()를 통해 추가해야 합니다.
다른 HandlerMethodArgumentResolver가 필요하다면 같은 방식으로 추가해주변 됩니다.*/
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginUserArgumentResolver loginUserArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(loginUserArgumentResolver);
    }
}
