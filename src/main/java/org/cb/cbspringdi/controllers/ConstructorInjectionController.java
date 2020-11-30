package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;

public class ConstructorInjectionController {
    private final IDescriptionService descriptionService;

    public ConstructorInjectionController(IDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    public String getDescription() {
        return descriptionService.getDescription();
    }
}
