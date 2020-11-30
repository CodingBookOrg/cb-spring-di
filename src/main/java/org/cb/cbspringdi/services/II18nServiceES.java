package org.cb.cbspringdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("II18nService")
public class II18nServiceES implements II18nService {
    @Override
    public String getDescription() {
        return "Hola";
    }
}
