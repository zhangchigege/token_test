package com.token.test.mapper;

import com.token.test.pojo.LoginLog;

public interface LoginLogMapper {

    void insert(LoginLog loginLog);

    LoginLog selectByMsgId(String msgId);

}
