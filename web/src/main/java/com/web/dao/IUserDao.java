package com.web.dao;

import com.web.model.User;

public interface IUserDao {

    User selectUser(long id);

}