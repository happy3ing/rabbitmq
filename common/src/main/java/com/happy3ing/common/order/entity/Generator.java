package com.happy3ing.common.order.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("generator")
public class Generator implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;


}
