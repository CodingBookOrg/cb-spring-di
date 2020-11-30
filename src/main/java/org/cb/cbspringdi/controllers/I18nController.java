package org.cb.cbspringdi.controllers;

import org.cb.cbspringdi.services.II18nService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final II18nService ii18nService;

    @Autowired //optional for CoIn after Spring version ~4.2
    public I18nController(II18nService ii18nService) {
        this.ii18nService = ii18nService;
    }

    public String getDescription() {
        return ii18nService.getDescription();
    }
}
