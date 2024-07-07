package com.example.casestudymodule.service;

import com.example.casestudymodule.model.User;

public interface IUserService {
    User login(String username, String password);

    User checkAccountExist(String username);

    void register(String username, String password);
}
