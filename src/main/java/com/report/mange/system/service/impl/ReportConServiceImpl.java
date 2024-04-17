package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportConMapper;
import com.report.mange.system.service.ReportConService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportConService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportConServiceImpl implements ReportConService {

    @Resource
    private ReportConMapper reportConMapper;

}