package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private final IDescriptionService descriptionService;

    @Autowired //optional for CoIn after Spring version ~4.2
    public ConstructorInjectionController(@Qualifier("coInDescriptionService") IDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    public String getDescription() {
        return descriptionService.getDescription();
    }
}
