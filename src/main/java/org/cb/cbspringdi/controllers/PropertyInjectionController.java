package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IDescriptionService;

public class PropertyInjectionController {
    public IDescriptionService descriptionService;

    public String getDescription() {
        return descriptionService.getDescription();
    }
}
