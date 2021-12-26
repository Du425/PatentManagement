package com.du.patentmanagement.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.du.patentmanagement.entity.Patentmanagement;
import com.du.patentmanagement.mapper.PatentmanagementMapper;
import com.du.patentmanagement.response.CommonResult;
import com.du.patentmanagement.service.IPatentmanagementService;
import com.du.patentmanagement.service.impl.PatentmanagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Du425
 * @since 2021-12-25
 */
@RestController
@RequestMapping("/patentmanagement")
public class PatentmanagementController {

    @Autowired
    PatentmanagementMapper patentmanagementMapper;
    @Autowired
    IPatentmanagementService iPatentmanagementService;

    @GetMapping("queryPatentList")
    public CommonResult queryPatentList(){
        QueryWrapper<Patentmanagement> wrapper = new QueryWrapper<>(null);
        List<Patentmanagement> patentmanagementList = patentmanagementMapper.selectList(wrapper);
        for (Patentmanagement patentmanagement : patentmanagementList) {
            System.out.println(patentmanagement);
        }
        return CommonResult.success(patentmanagementList);
    }

    @GetMapping("queryPatent")
    public CommonResult queryPatent(@RequestBody Patentmanagement patentmanagement){
        QueryWrapper<Patentmanagement> wrapper = new QueryWrapper<>();
        wrapper.eq("id",patentmanagement.getId())
                .or().eq("name",patentmanagement.getName())
                .or().eq("author",patentmanagement.getAuthor())
                .or().eq("number",patentmanagement.getNumber())
                .or().eq("apply_date",patentmanagement.getApplyDate())
                .or().eq("owner",patentmanagement.getOwner())
                .or().eq("announce_date",patentmanagement.getAnnounceDate());
        List<Patentmanagement> patentmanagementList = patentmanagementMapper.selectList(wrapper);
        for (Patentmanagement patentmanagement1 : patentmanagementList) {
            System.out.println(patentmanagement1);
        }
        return CommonResult.success("查询成功",patentmanagementList);
    }
    
    @PostMapping("/updatePatent")
    public CommonResult updatePatent(@RequestBody Patentmanagement patentmanagement){
        int update = patentmanagementMapper.updateById(patentmanagement);
        if (update == 1){
            return CommonResult.success("修改成功");
        }else {
            return CommonResult.failed("修改失败");
        }
    }
    
    @PutMapping("/addPatent")
    public CommonResult addPatent(@RequestBody Patentmanagement patentmanagement){
        if (patentmanagementMapper.insert(patentmanagement) == 1){
            return CommonResult.success("插入成功");
        }else {
            return CommonResult.failed("插入失败");
        }
    }
    
    @DeleteMapping("/deletePatent")
    public CommonResult deletePatent(@RequestBody Patentmanagement patentmanagement){
        QueryWrapper<Patentmanagement> wrapper = new QueryWrapper<>();
        wrapper.eq("id",patentmanagement.getId())
                .or().eq("name",patentmanagement.getName())
                .or().eq("number",patentmanagement.getNumber());
        int delete = patentmanagementMapper.delete(wrapper);
        if(delete == 1){
            return CommonResult.success("删除成功");
        }else {
            return CommonResult.failed("删除失败");
        }
    }
}

