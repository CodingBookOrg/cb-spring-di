package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    @Qualifier("poInDescriptionService")
    public IDescriptionService descriptionService;

    public String getDescription() {
        return descriptionService.getDescription();
    }
}
