package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportAccountMapper;
import com.report.mange.system.service.ReportAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportAccountService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportAccountServiceImpl implements ReportAccountService {

    @Resource
    private ReportAccountMapper reportAccountMapper;

}