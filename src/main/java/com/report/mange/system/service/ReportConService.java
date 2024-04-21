package com.report.mange.system.service;

import com.report.mange.system.model.ReportCon;
import com.report.mange.system.query.ReportConQuery;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportConService接口
 * @date 2024/04/17 19:27
 */
public interface ReportConService {
    Integer saveReportConAdd(ReportCon reportCon);

    Integer saveReportConModify(ReportCon reportCon);


    List<ReportCon> queryReportCon(ReportConQuery query);


}