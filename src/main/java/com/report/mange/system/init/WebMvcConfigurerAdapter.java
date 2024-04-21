//package com.report.mange.system.init;
//
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import com.report.mange.system.interceptor.AuthenticationInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @author:@liubowen
// * @Description:添加拦截器
// * @Date: 2017-12-23 16:35
// */
//@Configuration
//public class WebMvcConfigurerAdapter implements WebMvcConfigurer {
//
//    @Resource
////    private FileUploadInterceptor fileUploadInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
//        registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**");
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(currentUserMethodArgumentResolver());
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(fastJsonHttpMessageConverterEx());
//    }
//
//    @Bean
//    public FastJsonHttpMessageConverter fastJsonHttpMessageConverterEx() {
//        return new FastJsonHttpMessageConverter();
//    }
//
//    @Bean
//    public CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver() {
//        return new CurrentUserMethodArgumentResolver();
//    }
//
//    @Bean
//    public AuthenticationInterceptor authenticationInterceptor() {
//        return new AuthenticationInterceptor();
//    }
//}