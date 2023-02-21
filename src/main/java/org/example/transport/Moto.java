package org.example.transport;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "prototype")
public class Moto implements Transport{
    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class moto: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class moto: destroy");
    }
}
