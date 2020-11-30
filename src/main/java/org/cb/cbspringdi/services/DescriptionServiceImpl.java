package org.cb.cbspringdi.services;

public class DescriptionServiceImpl implements IDescriptionService {
    @Override
    public String getDescription() {
        return "This a DI service implementation without Spring";
    }
}
