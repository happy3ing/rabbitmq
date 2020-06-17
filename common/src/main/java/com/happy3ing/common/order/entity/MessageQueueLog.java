package com.happy3ing.common.order.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("message_queue_log")
public class MessageQueueLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    private Integer state;

    private LocalDate createTime;

    private LocalDate updateTime;

    private Integer count;


}
