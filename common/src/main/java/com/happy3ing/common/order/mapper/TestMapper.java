package com.happy3ing.common.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.happy3ing.common.order.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-15
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

    @Select("select * from order_test where name = #{name}")
    List<Test> query(String name);

    IPage<Test> selectPage(Page<?> page);

    int deleteById(String id);
}
