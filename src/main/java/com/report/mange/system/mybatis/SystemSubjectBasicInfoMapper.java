package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.SystemSubjectBasicInfo;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import com.report.mange.system.vo.BreakdownRuleVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SystemSubjectBasicInfoMapper extends Mapper<SystemSubjectBasicInfo> {
    List<BreakdownRuleVO> queryFirstSystemSubject();

    List<BreakdownRuleDetailVO> querySecondSystemSubject(ReportCostBreakdownRule rule);
}