package com.tanzania.taasoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greetings(){
         return "Welcome home,New Developers now";
    }

    @RequestMapping("/about")
    public String about(){
         return  "We dont teach , but we educate ... !";
    }

    @RequestMapping("/contact")
    public String contacts()
    {
         return  "Contact us:\n Phone: 0684573370 \n Email: bennycive@gmail.com";
    }

    @RequestMapping("/service")
    public String service(){
         return "The services are:\n 1: Website developemsnts \n 2: Computer networking \n 3: Computer maintenence and repaires";
    }

}
