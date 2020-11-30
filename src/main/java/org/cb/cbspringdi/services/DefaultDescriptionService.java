package org.cb.cbspringdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DefaultDescriptionService implements IDescriptionService {
    @Override
    public String getDescription() {
        return "This a DI service implementation - Default (Primary)";
    }
}
