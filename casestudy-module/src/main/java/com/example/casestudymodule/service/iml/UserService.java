package com.example.casestudymodule.service.iml;

import com.example.casestudymodule.model.User;
import com.example.casestudymodule.repository.IUserRepository;
import com.example.casestudymodule.repository.iml.UserRepository;
import com.example.casestudymodule.service.IUserService;

public class UserService implements IUserService {
    private static final IUserRepository userRepository = new UserRepository();
    @Override
    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public User checkAccountExist(String username) {
        return null;
    }

    @Override
    public void register(String username, String password) {

    }
}
