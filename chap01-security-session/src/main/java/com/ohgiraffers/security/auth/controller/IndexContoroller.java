package com.ohgiraffers.security.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexContoroller {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @GetMapping("/admin/page")
    public ModelAndView admin(ModelAndView mv){
        mv.setViewName("admin/page");
        return mv;
    }

    @GetMapping("/user/page")
    public ModelAndView user(ModelAndView mv){
        mv.setViewName("user/page");
        return mv;
    }
}
