package com.report.mange.system.controller;

import com.report.mange.system.model.ReportUser;
import com.report.mange.system.service.ReportUserService;
import com.report.mange.system.utils.ApiResult;
import com.report.mange.system.vo.ReportConVO;
import com.report.mange.system.vo.ReportUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportUserController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "人员")
@RestController
@RequestMapping("/reportUser")
public class ReportUserController {
    Logger logger = LoggerFactory.getLogger(ReportUserController.class);
    @Resource
    private ReportUserService reportUserService;

//    @LoginRequired
//    @RequestMapping(value = "/modifyUserInfo")
//    public String modifyUserInfo(@CurrentUser SysUser user, String userId, String userName, String realName, String cellphone, String emodelId, String email, String description) {
//        logger.info(user.getUserName());
//        logger.info("registeredUser:userId:" + userId + ",userName:" + userName + ",realName:" + realName + ",cellphone:" + cellphone + ",emodelId:" + emodelId + ",email" + email + ",description:" + description);
//        JSONObject jsonObject = reportUserService.modifyUserInfo(userId, userName, realName, cellphone, emodelId, email, description);
//        return jsonObject.toJSONString();
//    }

    /**
     * @Description: 查询全部合同
     */
    @ApiOperation("查询人员")
    @PostMapping("/queryAllUser")
    public ApiResult<List<ReportUserVO>> queryAllUser() throws Exception {
        List<ReportUserVO> list = reportUserService.queryAllUser();
        return ApiResult.ok(list);
    }
}