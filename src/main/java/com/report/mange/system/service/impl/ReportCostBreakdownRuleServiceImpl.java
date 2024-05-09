package com.report.mange.system.service.impl;

import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleVO;
import com.report.mange.system.mybatis.ReportCostBreakdownRuleMapper;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportCostBreakdownRuleServiceImpl implements ReportCostBreakdownRuleService {

    @Resource
    private ReportCostBreakdownRuleMapper reportCostBreakdownRuleMapper;


    /**
     * 查询费用规则信息
     *
     * @return
     */
    @Override
    public List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule() {
        return reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRule();
    }

    /**
     * 新增费用规则信息
     *
     * @return
     */
    @Override
    public Integer saveReportCostBreakdownRuleAdd(List<ReportCostBreakdownRuleVO> reportCostBreakdownRule) {
        return null;
    }
}