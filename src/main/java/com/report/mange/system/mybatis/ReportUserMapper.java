package com.report.mange.system.mybatis;

import com.report.mange.system.model.ReportUser;
import com.report.mange.system.vo.ReportUserVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface ReportUserMapper extends Mapper<ReportUser> {

    List<ReportUser> getUserInfo(ReportUser user);

    Integer saveUserInfoAdd(ReportUser user);

    List<ReportUserVO> queryAllUser();


}