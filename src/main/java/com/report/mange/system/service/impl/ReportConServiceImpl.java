package com.report.mange.system.service.impl;

import com.report.mange.system.model.ReportCon;
import com.report.mange.system.mybatis.ReportConMapper;
import com.report.mange.system.query.ReportConQuery;
import com.report.mange.system.service.ReportConService;
import com.report.mange.system.utils.SnowflakeManager;
import com.report.mange.system.vo.ReportConVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author 刘博文
 * @Description: 报表合同信息
 * @date 2024/04/17 19:27
 */
@Service
public class ReportConServiceImpl implements ReportConService {

    @Resource
    private ReportConMapper reportConMapper;
    @Resource
    private SnowflakeManager snowflakeManager;


    /**
     * 新增报表合同信息
     *
     * @param reportCon
     * @return
     */
    @Override
    public Integer saveReportConAdd(ReportCon reportCon) {
        reportCon.setConId(snowflakeManager.nextValue());
        return reportConMapper.saveReportConAdd(reportCon);
    }


    /**
     * 修改合同信息
     *
     * @param reportCon
     * @return
     */
    @Override
    public Integer saveReportConModify(ReportCon reportCon) {
        return reportConMapper.saveReportConModify(reportCon);
    }


    /**
     * 查询报表合同信息
     *
     * @param query
     * @return
     */
    @Override
    public List<ReportCon> queryReportCon(ReportConQuery query) {
        return reportConMapper.queryReportCon(query);
    }


    /**
     * 查询所有合同信息
     *
     * @return
     */
    @Override
    public List<ReportConVO> queryAllReportCon() {
        return reportConMapper.queryAllReportCon();
    }
}