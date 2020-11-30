package org.cb.cbspringdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("II18nService")
public class II18nServiceEN implements II18nService {
    @Override
    public String getDescription() {
        return "Hello";
    }
}
