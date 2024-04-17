package com.report.mange.system.service.impl;

import com.report.mange.system.mybatis.ReportCostBreakdownRuleUserRelMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleUserRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: ReportCostBreakdownRuleUserRelService接口实现类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Service
public class ReportCostBreakdownRuleUserRelServiceImpl  implements ReportCostBreakdownRuleUserRelService {

    @Resource
    private ReportCostBreakdownRuleUserRelMapper reportCostBreakdownRuleUserRelMapper;

}