package com.report.mange.system.config;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;
import com.report.mange.system.interceptor.SaTokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册Sa-Token的路由拦截器，并排除登录接口或其他可匿名访问的接口地址 (与注解拦截器无关)
        registry.addInterceptor(new SaTokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("report-mange-system/swagger-resources/**", "report-mange-system/swagger-ui.html/**")
                .excludePathPatterns("report-mange-system/swagger-resources/**", "report-mange-system/swagger-ui.html/**")
                .excludePathPatterns("report-mange-system/login/doLogin");
    }
}