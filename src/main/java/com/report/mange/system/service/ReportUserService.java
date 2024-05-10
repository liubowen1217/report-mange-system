package com.report.mange.system.service;

import com.report.mange.system.model.ReportUser;
import com.report.mange.system.vo.ReportUserVO;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportUserService接口
 * @date 2024/04/17 19:27
 */
public interface ReportUserService {

    List<ReportUser> getUserInfo(ReportUser user);

    List<ReportUserVO> queryAllUser();
}