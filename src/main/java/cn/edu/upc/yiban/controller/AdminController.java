package cn.edu.upc.yiban.controller;

import cn.edu.upc.yiban.config.setting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Created by 77dfeba on 2016/6/6.
 */
@Controller
public class AdminController {
    @Autowired
    private HttpSession session = null;

    @RequestMapping(value = "/admin")
    public String isAdmin() {
        if (session.getAttribute("user") == null) {
            return "login";
        } else {
            return "admin";
        }
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginAdmin(String username,String password){
        if(Objects.equals(username, setting.adminusername) && Objects.equals(password, setting.adminpassword)){
            session.setAttribute("user","admin");
            return "redirect:admin";
        }
        else
            return "redirect:login";
    }
}
