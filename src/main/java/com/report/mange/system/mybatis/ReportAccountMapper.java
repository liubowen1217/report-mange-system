package com.report.mange.system.mybatis;


import com.report.mange.system.dto.UserAccountDTO;
import com.report.mange.system.model.ReportAccount;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportAccountMapper extends Mapper<ReportAccount> {
    List<UserAccountDTO> getUserAccountInfo(ReportAccount account);
}