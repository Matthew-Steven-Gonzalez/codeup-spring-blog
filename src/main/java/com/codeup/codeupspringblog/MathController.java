package com.codeup.codeupspringblog;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public Integer add(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @RequestMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public Integer sub(@PathVariable int num1 , @PathVariable int num2){
        return num1 - num2;
    }

    @RequestMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public Integer multi(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @RequestMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public Integer divide(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }

}
