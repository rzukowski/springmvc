package com.websystique.springmvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    
@Value( "${java.helloString}" )
private String helloString;

	  @RequestMapping(method = RequestMethod.GET)
	    public String getIndexPage() {
                System.out.println("COSTAM");
                System.out.println(helloString);
	        return "UserManagement";
	    }
            
            @RequestMapping(method = RequestMethod.GET,value = "/login")
	    public String getLogin() {
                System.out.println("COSTAM");
                System.out.println(helloString);
	        return "login";
	    }

}