package com.happy3ing.common.order.service.impl;

import com.happy3ing.common.order.entity.MessageQueueLog;
import com.happy3ing.common.order.mapper.MessageQueueLogMapper;
import com.happy3ing.common.order.service.MessageQueueLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dai Mengmeng
 * @since 2020-06-16
 */
@Service("messageQueueLogService")
public class MessageQueueLogServiceImpl extends ServiceImpl<MessageQueueLogMapper, MessageQueueLog> implements MessageQueueLogService {

}
