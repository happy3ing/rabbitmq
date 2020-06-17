package com.happy3ing.common.order.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.happy3ing.common.order.entity.Test;
import com.happy3ing.common.order.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-15
 */
@RestController
@RequestMapping("/order/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public List<Test> list(){
        return testService.list();
    }

    @GetMapping("/query")
    public List<Test> query(String name){
        return testService.query(name);
    }

    @GetMapping("/page")
    public IPage<Test> page(Page<Test> testPage){

        return testService.selectPage(testPage);
    }

    @GetMapping("/{id}")
    public Test getOne(@PathVariable String id){
        return testService.getById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody Test test){
        return testService.saveOrUpdate(test);
    }

    @PutMapping
    public Boolean update(@RequestBody Test test){
        return testService.saveOrUpdate(test);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable String id){
        return testService.deleteById(id);
    }
}
