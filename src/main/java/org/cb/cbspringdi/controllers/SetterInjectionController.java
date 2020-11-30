package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;

public class SetterInjectionController {
    private IDescriptionService descriptionService;

    public String getDescription() {
        return descriptionService.getDescription();
    }

    public void setDescriptionService(IDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }
}
