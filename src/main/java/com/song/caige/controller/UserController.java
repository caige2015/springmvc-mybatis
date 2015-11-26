package com.song.caige.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.song.caige.module.UserTO;
import com.song.caige.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value="/toLogin.html", method=RequestMethod.GET)
    public String toLogin(){
        return "user/login";
    }
    
    @RequestMapping(value="/login.html", method={RequestMethod.POST,RequestMethod.GET})
    public String login(HttpServletRequest request,HttpServletResponse response,HttpSession session, Model model
        ,UserTO userTO) throws Exception{
        UserTO ut = userService.loginByName(userTO);
        if(ut == null){
            throw new Exception("输错密码了！");
        }
        model.addAttribute("user", ut);
        session.setAttribute("user", ut);
        return "user/first";
    }
    
    @RequestMapping(value = "/toReqisterJsp.html", method=RequestMethod.GET)
    public String toRegeister(){
        return "user/register";
    }
    
    @RequestMapping(value="/register.html", method = RequestMethod.POST)
    public String register(HttpServletRequest request,HttpServletResponse response,HttpSession session, Model model
         ,UserTO userTO,RedirectAttributes attr) throws Exception{
        int result = userService.addUsers(userTO);
        if(result <= 0){
            throw new Exception("新增失败！");
        }
        attr.addFlashAttribute("userTO", userTO);
        return "redirect:login.html";
    }
}
