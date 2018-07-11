package com.tomSpringProject.demo.controllers.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest servletRequest, Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Request: " + servletRequest.getRequestURL() + " raise " + e);
        return new ModelAndView("redirectpage");
    }

}
