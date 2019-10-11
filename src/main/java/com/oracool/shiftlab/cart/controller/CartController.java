package com.oracool.shiftlab.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class CartController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getS() {
        return "test";
    }
}
