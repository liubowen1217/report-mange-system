package com.report.mange.system.service;


import com.report.mange.system.vo.ReportDeptVO;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportDeptService接口
 * @date 2024/05/10 15:47
 */
public interface ReportDeptService {

    List<ReportDeptVO> queryAllDept();
}