package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportDept;
import com.report.mange.system.vo.ReportDeptVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportDeptMapper extends Mapper<ReportDept> {
    List<ReportDeptVO> queryAllDept();

}