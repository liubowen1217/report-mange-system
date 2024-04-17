package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportUserMapper;
import com.report.mange.system.service.ReportUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportUserService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportUserServiceImpl implements ReportUserService {

    @Resource
    private ReportUserMapper reportUserMapper;

}