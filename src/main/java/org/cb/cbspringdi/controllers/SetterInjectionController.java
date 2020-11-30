package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    private IDescriptionService descriptionService;


    public String getDescription() {
        return descriptionService.getDescription();
    }

    @Autowired
    public void setDescriptionService(IDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }
}
