package ca.gb.comp3095.foodrecipe.controller.configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String greeting() {
        return "Hello";
    }
}