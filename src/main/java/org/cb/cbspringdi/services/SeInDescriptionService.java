package org.cb.cbspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class SeInDescriptionService implements IDescriptionService {
    @Override
    public String getDescription() {
        return "This a DI service implementation - SeIn";
    }
}
