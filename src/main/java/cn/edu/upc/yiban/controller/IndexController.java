package cn.edu.upc.yiban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 77dfeba on 2016/6/6.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String Indexcontroller(){
        return "index";
    }
}
