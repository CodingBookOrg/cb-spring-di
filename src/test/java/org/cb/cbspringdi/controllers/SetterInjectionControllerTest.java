package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.DescriptionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;
    @BeforeEach
    void setUp() {
        /**
         * We will mimic the spring context with property injection
         */
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setDescriptionService(new DescriptionServiceImpl());
    }

    @Test
    void setPropertyInjectionService() {
        System.out.println(setterInjectionController.getDescription());
    }
}
