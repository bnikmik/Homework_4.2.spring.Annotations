package org.example;

import org.example.config.Config;
import org.example.persons.Person;
import org.example.transport.Car;
import org.example.transport.Moto;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Moto moto1 = context1.getBean("moto", Moto.class);
        Moto moto2 = context1.getBean("moto", Moto.class);

        moto1.go();

        Person person1 = context1.getBean("person", Person.class);

        person1.goByTransport();

        Car car1 = context1.getBean("car", Car.class);
        Car car2 = context1.getBean("car", Car.class);

        System.out.println("**********");

        System.out.println(moto1 == moto2);
        System.out.println(car1 == car2);
        context1.close();
        System.out.println("**********");
        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(Config.class);

        Person person2 = context2.getBean("newPerson", Person.class);
        person2.goByTransport();
        context2.close();


    }
}




