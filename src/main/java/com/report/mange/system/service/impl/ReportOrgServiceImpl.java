package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportOrgMapper;
import com.report.mange.system.service.ReportOrgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: ReportOrgService接口实现类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Service
public class ReportOrgServiceImpl implements ReportOrgService {

    @Resource
    private ReportOrgMapper reportOrgMapper;

}