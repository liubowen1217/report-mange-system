package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportCostBreakdownRuleDetailMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleDetailService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportCostBreakdownRuleDetailServiceImpl implements ReportCostBreakdownRuleDetailService {

    @Resource
    private ReportCostBreakdownRuleDetailMapper reportCostBreakdownRuleDetailMapper;

}