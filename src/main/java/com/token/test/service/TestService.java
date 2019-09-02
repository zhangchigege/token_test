package com.token.test.service;

import com.token.test.common.ServerResponse;
import com.token.test.pojo.Mail;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
