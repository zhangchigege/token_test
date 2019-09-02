package com.token.test.service;

import com.token.test.common.ServerResponse;
import com.token.test.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getOne(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);

    User getByUsernameAndPassword(String username, String password);

    ServerResponse login(String username, String password);

}
