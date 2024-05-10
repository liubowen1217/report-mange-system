package com.report.mange.system.service.impl;

import com.report.mange.system.model.ReportDept;
import com.report.mange.system.mybatis.ReportDeptMapper;
import com.report.mange.system.service.ReportDeptService;
import com.report.mange.system.vo.ReportDeptVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportDeptService接口实现类
 * @date 2024/05/10 15:47
 */
@Service
public class ReportDeptServiceImpl implements ReportDeptService {

    @Resource
    private ReportDeptMapper reportDeptMapper;

    /**
     * 查询全部单位
     *
     * @return
     */
    @Override
    public List<ReportDeptVO> queryAllDept() {
        return reportDeptMapper.queryAllDept();
    }
}