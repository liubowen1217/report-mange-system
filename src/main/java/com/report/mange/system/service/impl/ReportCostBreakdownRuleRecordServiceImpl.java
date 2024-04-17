package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportCostBreakdownRuleRecordMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: ReportCostBreakdownRuleRecordService接口实现类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Service
public class ReportCostBreakdownRuleRecordServiceImpl implements ReportCostBreakdownRuleRecordService {

    @Resource
    private ReportCostBreakdownRuleRecordMapper reportCostBreakdownRuleRecordMapper;

}