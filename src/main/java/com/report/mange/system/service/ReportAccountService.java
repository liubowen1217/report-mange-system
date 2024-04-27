package com.report.mange.system.service;

import com.report.mange.system.dto.UserAccountDTO;
import com.report.mange.system.model.ReportAccount;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportAccountService接口
 * @date 2024/04/17 19:27
 */
public interface ReportAccountService {
    List<UserAccountDTO> getUserAccountInfo(ReportAccount account);

}