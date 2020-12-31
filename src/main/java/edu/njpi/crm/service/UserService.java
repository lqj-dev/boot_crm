package edu.njpi.crm.service;

import edu.njpi.crm.model.User;

public interface UserService {
    public User findUser(String usercode,String password);
}
