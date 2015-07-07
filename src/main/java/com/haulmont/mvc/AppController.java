package com.haulmont.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//test with http://localhost:8080/mvc-template/app/index.do
@Controller
@RequestMapping("/app/")
public class AppController {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView showIndex(ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("index", model);
        return modelAndView;
    }

}