package com.report.mange.system.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.report.mange.system.dto.UserAccountDTO;
import com.report.mange.system.model.ReportAccount;
import com.report.mange.system.mybatis.ReportAccountMapper;
import com.report.mange.system.mybatis.ReportUserMapper;
import com.report.mange.system.service.ReportAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportAccountService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportAccountServiceImpl implements ReportAccountService {

    @Resource
    private ReportAccountMapper reportAccountMapper;
    @Resource
    private ReportUserMapper reportUserMapper;


    @Override
    public List<UserAccountDTO> getUserAccountInfo(ReportAccount account) {
        return reportAccountMapper.getUserAccountInfo(account);
    }

    public List<ReportAccount> getUserAccountBynName(ReportAccount account) {
        return reportAccountMapper.getUserAccountBynName(account);
    }


    /**
     * 注册用户信息
     *
     * @param account
     * @return
     */
    @Override
    public Integer regist(UserAccountDTO account) {
//        StpUtil.login(userId());
        return null;
    }


}