package com.report.mange.system.controller;

import com.report.mange.system.service.ReportUserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘博文
 * @Description: ReportUserController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "ReportUsercontroller")
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
}