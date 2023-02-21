package org.example.transport;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
@Scope(value = "singleton")
public class Car implements Transport {
    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class car: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class car: destroy");
    }
}
