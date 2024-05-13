package com.report.mange.system.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.report.mange.system.config.CustomException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 检查token是否有效
        if (!StpUtil.isLogin()) {
            // token无效，重定向到登录页面
            throw new CustomException("token无效，请重新登录");
        }
        // token有效，继续执行
        return true;
    }
}
