package edu.uestc.ssmdemo.web;

import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Login {
    @Autowired
    LoginService loginService;

//    @RequestMapping("login")
//    public String loginVerify(String phoneno, String password, Model model) {
//        boolean result = loginService.verify(phoneno, password);
//        if (result == false) return "login/fail";
////        return "login/fail";
//        return "login/welcome";
//    }

    @RequestMapping("login")
    public String loginVerify(Userinfo userinfo, Model model) {
        Userinfo result = loginService.verify(userinfo);
        if (result == null) return "login/fail";
        model.addAttribute("user",result);
        return "login/welcome";
    }
}
