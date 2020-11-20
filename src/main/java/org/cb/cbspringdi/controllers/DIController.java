package org.cb.cbspringdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DIController {
    public String greet() {
        return "Hello DI";
    }
}
