package com.report.mange.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.report.mange.system.dto.UserAccountDTO;
import com.report.mange.system.model.ReportAccount;
import com.report.mange.system.service.ReportAccountService;
import com.report.mange.system.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "登录认证")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ReportAccountService accountService;

    @ApiOperation("登录")
    @PostMapping("/doLogin")
    public ApiResult<Integer> doLogin(@RequestBody ReportAccount account) throws Exception {
        if (StringUtils.isBlank(account.getuPassword())) {
            return ApiResult.error("密码不能为空");
        }
        if (StringUtils.isBlank(account.getuAccountName())) {
            return ApiResult.error("用户名不能为空");
        }
//        第一步：对比前端提交的账号名称和密码是否正确，比对成功后开始登录
        List<UserAccountDTO> accpuntList = accountService.getUserAccountInfo(account);
        if (accpuntList.size() <= 0) {
            return ApiResult.error("用户名不存在");
        }
        UserAccountDTO accountResult = accpuntList.get(0);
        //查询用户名密码是否正确
        if (accountResult.getuAccountName().equals(account.getuAccountName()) && accountResult.getuPassword().equals(account.getuPassword())) {
//            第二步：根据账号id,进行登录。填入的参数应该保持用户表唯一，比如用户id，不能填入整个对象
            StpUtil.login(accountResult.getUserAcctId());
            StpUtil.getSession().set("user", accountResult);
//            第三步：返回数据给前端。SaReasult是对返回结果的简单封装。
            return ApiResult.ok();
        }
        return ApiResult.error("登录失败");
    }

    @ApiOperation("注册")
    @PostMapping("/regist")
    public ApiResult<Integer> regist(@RequestBody UserAccountDTO account) throws Exception {
        if (StringUtils.isBlank(account.getuName())) {
            ApiResult.error("用户姓名不能为空");
        }
        if (StringUtils.isBlank(account.getDeptCode())) {
            ApiResult.error("用户单位不能为空");
        }
        if (StringUtils.isBlank(account.getuAccountName())) {
            ApiResult.error("用户名不能为空");
        }
        if (StringUtils.isBlank(account.getuPassword())) {
            ApiResult.error("密码不能为空");
        }

        //查询数据库 看用户名是否已经存在
        ReportAccount reportAccount = new ReportAccount();
        reportAccount.setuAccountName(account.getuAccountName());
        List<ReportAccount> accountList = accountService.getUserAccountBynName(reportAccount);
        if (accountList.size() > 0) {
            return ApiResult.error("当前用户名已存在");
        }

        //存储用户信息
        accountService.regist(account);

        return ApiResult.error("登录失败");
    }

}
