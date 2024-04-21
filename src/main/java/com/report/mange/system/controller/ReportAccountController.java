package com.report.mange.system.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘博文
 * @Description: ReportAccountController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "ReportAccountcontroller")
@RestController
@RequestMapping("/reportAccount")
public class ReportAccountController {
//
//    @Resource
//    private ReportAccountService reportAccountService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportAccount reportAccount) throws Exception {
//        Integer state = reportAccountService.insert(reportAccount);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportAccountService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportAccount reportAccount) throws Exception {
//        Integer state = reportAccountService.update(reportAccount);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportAccount> selectById(@RequestParam String id) throws Exception {
//        ReportAccount reportAccount = reportAccountService.selectById(id);
//        return ApiResult.ok(reportAccount);
//    }
//
//    /**
//     * @param page 页码
//     * @param size 每页条数
//     * @Description: 分页查询
//     * @Reutrn ApiResult<PageInfo < ReportAccount>>
//     */
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportAccount>> list(@RequestParam(defaultValue = "0") Integer page,
//                                                   @RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportAccount> list = reportAccountService.selectAll();
//        PageInfo<ReportAccount> pageInfo = new PageInfo<ReportAccount>(list);
//        return ApiResult.ok(pageInfo);
//    }
}