package org.acme.testcoverage;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Slf4j
public class GreetingService {

    public String greeting(String name) {
        log.info("{} will be greeted.", name);
        return "hello " + name;
    }
}
