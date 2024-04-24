package com.report.mange.system.controller;

import com.report.mange.system.model.District;
import com.report.mange.system.service.DistrictService;
import com.report.mange.system.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "DistrictController")
@RestController
@RequestMapping("/district")
public class DistrictController {
    Logger logger = LoggerFactory.getLogger(DistrictController.class);
    @Resource
    private DistrictService districtService;

    /**
     * @Description: 查询所有省份
     * @Reutrn ApiResult<List < ReportCon>>
     */
    @ApiOperation("查询所有省份")
    @PostMapping("/queryProvince")
    public ApiResult<List<District>> queryProvince() {
        List<District> districts = districtService.queryProvince();
        return ApiResult.ok(districts);
    }

    /**
     * @Description: 查询城市或地区
     * @Reutrn ApiResult<List < ReportCon>>
     */
    @ApiOperation("查询城市或地区")
    @PostMapping("/queryCity")
    public ApiResult<List<District>> queryCity(@RequestBody District district) throws Exception {
        List<District> list = districtService.queryCity(district.getCode());
        return ApiResult.ok(list);
    }

    /**
     * @Description: 查询所有地址信息
     */
    @ApiOperation("查询所有地址信息")
    @PostMapping("/queryDistrictList")
    public ApiResult<List<District>> queryDistrictList() throws Exception {
        List<District> list = districtService.queryDistrictList();
        return ApiResult.ok(list);
    }

    /**
     * @Description: 根据编码集合查询
     */
    @ApiOperation("根据编码集合查询")
    @PostMapping("/queryByCodeList")
    public ApiResult<List<District>> queryByCodeList(@RequestParam List<String> codeList) throws Exception {
        List<District> list = districtService.queryByCodeList(codeList);
        return ApiResult.ok(list);
    }

    /**
     * 查询省和市
     *
     * @param codeList
     * @return
     */
    @ApiOperation("查询省和市")
    @PostMapping("/queryProvinceAndCity")
    public ApiResult<List<District>> queryProvinceAndCity(@RequestParam List<String> codeList) throws Exception {
        List<District> list = districtService.queryProvinceAndCity(codeList);
        return ApiResult.ok(list);
    }

    /**
     * 查询上级地区查下级
     *
     * @param codeList
     * @return
     */
    @ApiOperation("查询上级地区查下级")
    @PostMapping("/queryByParentCodes")
    public ApiResult<List<District>> queryByParentCodes(@RequestParam List<String> codeList) throws Exception {
        List<District> list = districtService.queryByParentCodes(codeList);
        return ApiResult.ok(list);
    }

    /**
     * 查询省份下第一个城市
     *
     * @param code
     * @return
     */
    @ApiOperation("查询省份下第一个城市")
    @PostMapping("/queryFirstCity")
    public ApiResult<District> queryFirstCity(@RequestParam String code) throws Exception {
        District district = districtService.queryFirstCity(code);
        return ApiResult.ok(district);
    }

    /**
     * 新增
     *
     * @param district 地区名称
     * @return 结果
     */
    @ApiOperation("新增")
    @PostMapping("/insertSelective")
    public ApiResult<Integer> insertSelective(@RequestBody District district) throws Exception {
        try {
            districtService.insertSelective(district);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * 修改
     *
     * @param district 地区名称
     * @return 结果
     */
    @ApiOperation("修改")
    @PostMapping("/updateSelective")
    public ApiResult<Integer> updateSelective(@RequestBody District district) throws Exception {
        try {
            districtService.updateSelective(district);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * 删除
     *
     * @return 结果
     */
    @ApiOperation("删除")
    @PostMapping("/delByCode")
    public ApiResult<Integer> delByCode(@RequestParam String code) throws Exception {
        try {
            districtService.delByCode(code);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * 根据名称获取名称地区信息（精准匹配）
     *
     * @param districtNames 地区名称
     * @return 结果
     */
    @ApiOperation("根据名称获取名称地区信息")
    @PostMapping("/allDistrictByNames")
    public ApiResult<List<District>> allDistrictByNames(@RequestParam List<String> districtNames) throws Exception {
        List<District> list = districtService.allDistrictByNames(districtNames);
        return ApiResult.ok(list);
    }
}
