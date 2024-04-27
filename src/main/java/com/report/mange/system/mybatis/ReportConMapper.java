package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCon;
import com.report.mange.system.query.ReportConQuery;
import com.report.mange.system.vo.ReportConVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportConMapper extends Mapper<ReportCon> {

    Integer saveReportConAdd(ReportCon reportCon);


    Integer saveReportConModify(ReportCon reportCon);


    List<ReportCon> queryReportCon(ReportConQuery query);

    List<ReportConVO> queryAllReportCon();
}