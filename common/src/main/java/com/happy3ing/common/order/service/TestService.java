package com.happy3ing.common.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.happy3ing.common.order.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-16
 */
public interface TestService extends IService<Test> {

    List<Test> query(String name);

    IPage<Test> selectPage(Page<Test> page);

    int deleteById(String id);

}
