package com.happy3ing.common.order.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.happy3ing.common.order.entity.Test;
import com.happy3ing.common.order.mapper.TestMapper;
import com.happy3ing.common.order.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-15
 */
//@Service("testService")
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> query(String name){
        return testMapper.query(name);
    }

    @Override
    public IPage<Test> selectPage(Page<Test> page){
        return testMapper.selectPage(page);
    }

    @Override
    public int deleteById(String id){
        return testMapper.deleteById(id);
    }

    @Override
    public boolean saveOrUpdate(Test entity) {
        return super.saveOrUpdate(entity);
    }
}
