package com.zy.spring.aop.service;

import com.zy.spring.aop.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void createUser(){
        if (1==1){
            throw new RuntimeException("该用户已存在");
        }
        System.out.println("执行创建用户逻辑");
        userDao.insert();
    }

    public String generateRandomPassword(String type , Integer length){
        System.out.println("按"+type+"方法生成"+length+"位随机密码");
        return "zhangsan";
    }
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
