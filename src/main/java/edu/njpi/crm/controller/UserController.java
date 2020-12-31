package edu.njpi.crm.controller;

import edu.njpi.crm.model.User;
import edu.njpi.crm.service.UserService;
import edu.njpi.crm.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/12/16 2:05 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.action")
    public String findUser(@RequestParam("usercode")String userCode,  @RequestParam("password")String password,
                           Model model, HttpSession session){
        //1. 获取用户对象
        User user = userService.findUser(userCode,Md5Util.stringToMD5(password));
        System.out.println(userCode+","+Md5Util.stringToMD5(password));
        //2. 判断用户对象是否为空,不为空,把user加入到session中,跳转到customer界面
        //3. user对象为空,把错误信息加入的model中,返回登录页面
        System.out.println(user);
        if(user!=null){
            session.setAttribute("USER_SESSION",user);
            return "redirect:customer/list.action";
        }else{
            model.addAttribute("msg","账号或者密码错误,请重新输入!");
            return "login";
        }

    }
    
    @RequestMapping("/logout.action")
    public String logout(HttpSession session){
        //1. 让session失效
        session.invalidate();
        //2. 跳转到登录页面
        return "redirect:login.action";
    }

    @RequestMapping(value="/login.action",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toCustomer.action")
    public String toCustomer(){
        return "customer";
    }
}
