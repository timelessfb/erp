package edu.uestc.ssmdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("addAdmin")
    public String AddAdmin(){
        return "authority_management/add";
    }


}
