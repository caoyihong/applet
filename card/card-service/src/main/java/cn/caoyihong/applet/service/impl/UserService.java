package cn.caoyihong.applet.service.impl;

import cn.caoyihong.applet.dao.UserInfoMapper;
import cn.caoyihong.applet.entity.UserInfo;
import cn.caoyihong.applet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caoyihong on 16-12-13.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    UserInfoMapper userInfoMapper;

    public void insertUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    public UserInfo getUserById(Long userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return userInfo;
    }
}
