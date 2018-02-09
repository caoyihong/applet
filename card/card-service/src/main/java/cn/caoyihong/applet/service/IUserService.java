package cn.caoyihong.applet.service;


import cn.caoyihong.applet.entity.UserInfo;

/**
 * Created by caoyihong on 16-12-13.
 */
public interface IUserService {

    public void insertUser(UserInfo userInfo);

    public UserInfo getUserById(Long userId);
}
