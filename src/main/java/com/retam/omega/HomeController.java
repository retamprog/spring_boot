package com.retam.omega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String proName;

    @RequestMapping("/")
     public String index(){
        System.out.println("App name: "+proName);
        return "index.html";
     }

    //  private String viewName(){
    //      return "index.html";
    //  }
}
