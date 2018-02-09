package cn.caoyihong.applet.controller;

import cn.caoyihong.applet.entity.UserInfo;
import cn.caoyihong.applet.service.IUserService;
import jdk.nashorn.internal.ir.IfNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by caoyihong on 16-12-13.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    public String showUserList(HttpServletRequest request, Model model){
        String strUserId = request.getParameter("userId") == null? "1" : request.getParameter("userId");
        Long userId = Long.parseLong(strUserId);
        UserInfo userInfo = userService.getUserById(userId);
        model.addAttribute("user", userInfo);
        return "showUser";
    }
}
