package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.DescriptionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;
    @BeforeEach
    void setUp() {
        /**
         * We will mimic the spring context with property injection
         * "Most preferred method"
         */
        constructorInjectionController = new ConstructorInjectionController(
                new DescriptionServiceImpl()
        );
    }

    @Test
    void CITest() {
        System.out.println(constructorInjectionController.getDescription());
    }
}
