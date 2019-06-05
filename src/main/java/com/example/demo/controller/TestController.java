package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

@Controller
public class TestController {

    @RequestMapping("/123")
    @ResponseBody
    public String getSuperSpeciesIndustryList(HttpServletRequest request, HttpServletResponse response){

        System.out.print("ascvavmd");
        System.out.print("ascvavmd");
        System.out.print("ascvavmd");
        System.out.print("ascvavmd");
        return "abc";
    }
}
