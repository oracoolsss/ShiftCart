package com.oracool.shiftlab.cart.controller;

import com.oracool.shiftlab.cart.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    Cart cart = new Cart();

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String getInfo(ModelMap model) {
        String fullInfo = "Item / Price / Count / Total price of items: \n";
        for (int i = 0; i < cart.getCartList().length; i++) {
            fullInfo = fullInfo + "{" + cart.getCartList(i) + "  /  " + cart.getPrice(i) + " rub  /  " + cart.getCount()[i]
                    + "  /  " + cart.getTotalSum()[i] + "}" + "\n";
        }
        fullInfo += "Total cost: " + cart.totalPrice() + " rub";
        return fullInfo;
    }

    @RequestMapping(value = "/add/{item}/{value}", method = RequestMethod.GET)
    @ResponseBody
    public String addItem(ModelMap model, @PathVariable String item, @PathVariable int value) {
        return cart.addCount(item, value);
    }

    @RequestMapping(value = "/remove/{item}/{value}", method = RequestMethod.GET)
    @ResponseBody
    public String removeItem(ModelMap model, @PathVariable String item, @PathVariable int value) {
        return cart.removeCount(item, value);
    }

    @RequestMapping(value = "/remove/{item}", method = RequestMethod.GET)
    @ResponseBody
    public String removeItem(ModelMap model, @PathVariable String item) {
        return cart.removeCount(item);
    }
}
