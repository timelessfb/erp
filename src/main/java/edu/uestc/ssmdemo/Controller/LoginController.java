package edu.uestc.ssmdemo.Controller;


import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("home_page")
    public String home(){
        return "index";
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        return "login/login";
    }

    @RequestMapping("login")
    public String Login(Userinfo user, HttpSession httpSession){
        System.out.println(user.getUserPassword() + "   " + user.getUserPhoneno());
        Userinfo u = userService.login(user);
        if (u != null){
            //System.out.println("u不为空");
            httpSession.setAttribute("user",u);
            return "redirect:home_page";
        }
        return "forward:loginPage";
    }

    @RequestMapping("user_exit")
    public String User_exit(HttpSession session){
        session.removeAttribute("user");
        return "forward:loginPage";
    }
}
