package org.example.persons;

import org.example.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person implements AbleToDrive {
    private Transport transport;

    public Person() {
    }

    @Autowired
    public Person(Transport transport) {
        this.transport = transport;
    }

    public void setMovable(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void goByTransport() {
        System.out.println("Владелец сел в транспорт");
        transport.go();
    }
}

