package com.report.mange.system.service.impl;

import com.report.mange.system.model.ReportUser;
import com.report.mange.system.mybatis.ReportUserMapper;
import com.report.mange.system.service.ReportUserService;
import com.report.mange.system.vo.ReportUserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportUserService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportUserServiceImpl implements ReportUserService {

    @Resource
    private ReportUserMapper reportUserMapper;


    /**
     * 查询用户信息
     *
     * @param user
     * @return
     */
    @Override
    public List<ReportUser> getUserInfo(ReportUser user) {
        return reportUserMapper.getUserInfo(user);
    }


    /**
     * 查询全部人员信息
     *
     * @return
     */
    @Override
    public List<ReportUserVO> queryAllUser() {
        return reportUserMapper.queryAllUser();
    }
}