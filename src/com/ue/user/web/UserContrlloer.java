package com.ue.user.web;



import com.sun.deploy.util.StringUtils;
import com.ue.user.entity.User;
import com.ue.user.service.UserServcie;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/11.
 */
public class UserContrlloer {

    private UserServcie userServcie;

    public void getUser(User user){
        userServcie.getUser(user.getUserId());
    }
    public static void main(String[] args) {
        Date date =new Date();
        StringUtils utils = new StringUtils();
        utils.equals("1");
        System.out.print("hello world");
    }
}
