package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.IPropertyInjectionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        /**
         * We will mimic the spring context with property injection
         */
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.propertyInjectionService = new IPropertyInjectionServiceImpl();
    }

    @Test
    void PITest() {
        System.out.println(propertyInjectionController.getDescription());
    }
}
