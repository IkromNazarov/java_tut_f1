package com.is;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class addController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        int k = i+j;
        int h = 900;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", k);

        return mv;
    }
}
