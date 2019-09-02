package com.token.test.mq.consumer;

import com.rabbitmq.client.Channel;
import com.token.test.mq.BaseConsumer;
import com.token.test.mq.MessageHelper;
import com.token.test.pojo.LoginLog;
import com.token.test.service.LoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginLogConsumer implements BaseConsumer {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    public void consume(Message message, Channel channel) {
        log.info("收到消息: {}", message.toString());
        LoginLog loginLog = MessageHelper.msgToObj(message, LoginLog.class);
        loginLogService.insert(loginLog);
    }
}
