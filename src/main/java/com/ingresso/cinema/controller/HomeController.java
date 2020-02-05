package com.ingresso.cinema.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response) {
    	// System.out.println(request.getServletContext().getRealPath("home.jsp"));
        return "home";
    }
}
