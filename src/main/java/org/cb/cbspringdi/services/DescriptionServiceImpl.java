package org.cb.cbspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class DescriptionServiceImpl implements IDescriptionService {
    @Override
    public String getDescription() {
        return "This a DI service implementation";
    }
}
