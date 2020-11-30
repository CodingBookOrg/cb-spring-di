package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IPropertyInjectionService;

public class PropertyInjectionController {
    public IPropertyInjectionService propertyInjectionService;

    public String getDescription() {
        return propertyInjectionService.getDescription();
    }
}
