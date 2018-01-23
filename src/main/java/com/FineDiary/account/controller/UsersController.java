package com.FineDiary.account.controller;

import com.FineDiary.account.service.SecurityService;
import com.FineDiary.account.service.UsersService;
import com.FineDiary.account.validator.UsersValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UsersController {

    @Autowired
    private UsersService userService;
    @Autowired
    private SecurityService securityService;

    @Autowired
    private UsersValidator userValidator;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }

}
