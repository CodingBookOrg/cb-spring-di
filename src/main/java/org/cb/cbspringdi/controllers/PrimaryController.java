package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final IDescriptionService descriptionService;

    public PrimaryController(IDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    public String getDescription() {
        return descriptionService.getDescription();
    }
}
