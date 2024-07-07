package com.example.casestudymodule.repository;

import com.example.casestudymodule.model.User;

public interface IUserRepository {
    User login(String username, String password);

    User checkAccountExist(String username);

    void register(String username, String password);
}
