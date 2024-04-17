package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportCostBreakdownRuleDetailRecordMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleDetailRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleDetailRecordService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportCostBreakdownRuleDetailRecordServiceImpl implements ReportCostBreakdownRuleDetailRecordService {

    @Resource
    private ReportCostBreakdownRuleDetailRecordMapper reportCostBreakdownRuleDetailRecordMapper;

}