package org.cb.cbspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class PoInDescriptionService implements IDescriptionService {
    @Override
    public String getDescription() {
        return "This a DI service implementation - PoIn";
    }
}
