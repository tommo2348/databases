package com.tomSpringProject.demo.controllers.Controller;

import com.tomSpringProject.ConnectionToDB;
import com.tomSpringProject.demo.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventDBController {

private ConnectionToDB connectionToDB;


    @GetMapping("/redirectpage")
    public ModelAndView getProducts(Model model) throws SQLException {
        connectionToDB = new ConnectionToDB();
        List<Person> usersInfo =  connectionToDB.connectingToDb();
//        model.addAttribute("products", Collections.emptyList());
        model.addAttribute("usersInfo", usersInfo);
        return new ModelAndView("redirectpage", model.asMap());
    }

//    @RequestMapping(path = "/products" , method = RequestMethod.GET)
//    public String welcome(Map<String,Object> model){
//        model.put("foobar","helo");
//        return "products";
//    }


//    @GetMapping("/rest" )
//    public Item catalogueItems(@RequestParam(required = false,
//            value =   ) String name, Integer amountOfItem){
//        return new Item(String.format("Hello, %s!", name,amountOfItem));
//    }

}