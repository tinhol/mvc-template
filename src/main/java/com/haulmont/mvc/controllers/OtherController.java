package com.haulmont.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//test with http://localhost:8080/mvc-template/other.do
@Controller
public class OtherController {
    @RequestMapping(value = "/other", method = RequestMethod.GET)
    public ModelAndView showIndex(ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("other", model);
        return modelAndView;
    }
}