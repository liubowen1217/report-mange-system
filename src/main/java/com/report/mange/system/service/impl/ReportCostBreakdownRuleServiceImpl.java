package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportCostBreakdownRuleMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportCostBreakdownRuleServiceImpl implements ReportCostBreakdownRuleService {

    @Resource
    private ReportCostBreakdownRuleMapper reportCostBreakdownRuleMapper;

}