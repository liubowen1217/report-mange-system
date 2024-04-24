package com.report.mange.system.service.impl;

import com.report.mange.system.model.District;
import com.report.mange.system.mybatis.DistrictMapper;
import com.report.mange.system.service.DistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Resource
    private DistrictMapper districtMapper;

    /**
     * 查询所有省份
     *
     * @return
     */
    @Override
    public List<District> queryProvince() {
        return districtMapper.queryProvince();
    }

    /**
     * 查询城市或地区
     *
     * @param code
     * @return
     */
    @Override
    public List<District> queryCity(String code) {
        return districtMapper.queryCity(code);
    }

    /**
     * 通过code查询地区信息
     *
     * @param code
     * @return
     */
    @Override
    public District queryByCode(String code) {
        return districtMapper.queryByCode(code);
    }

    /**
     * 查询所有地址信息
     *
     * @return
     */
    @Override
    public List<District> queryDistrictList() {
        return districtMapper.queryDistrictList();
    }

    /**
     * 根据编码集合查询
     *
     * @param codeList
     * @return
     */
    @Override
    public List<District> queryByCodeList(List<String> codeList) {
        return districtMapper.queryByCodeList(codeList);
    }

    /**
     * 查询省和市
     *
     * @param codeList
     * @return
     */
    @Override
    public List<District> queryProvinceAndCity(List<String> codeList) {
        return districtMapper.queryProvinceAndCity(codeList);
    }

    /**
     * 查询上级地区查下级
     *
     * @param codeList
     * @return
     */
    @Override
    public List<District> queryByParentCodes(List<String> codeList) {
        return districtMapper.queryByParentCodes(codeList);
    }

    /**
     * 查询省份下第一个城市
     *
     * @param code
     * @return
     */
    @Override
    public District queryFirstCity(String code) {
        return districtMapper.queryFirstCity(code);
    }

    /**
     * 新增
     *
     * @param district 新增
     */
    @Override
    public void insertSelective(District district) {
        districtMapper.insertSelective(district);
    }

    /**
     * 更新
     *
     * @param district
     */
    @Override
    public void updateSelective(District district) {
        districtMapper.updateSelective(district);
    }


    /**
     * 删除
     *
     * @param code 编码
     */
    @Override
    public void delByCode(String code) {
        districtMapper.delByCode(code);
    }

    /**
     * 根据名称获取名称地区信息（精准匹配）
     *
     * @param districtNames 地区名称
     * @return 结果
     */
    @Override
    public List<District> allDistrictByNames(List<String> districtNames) {
        return districtMapper.allDistrictByNames(districtNames);
    }
}
