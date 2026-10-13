package com.codesmines111.springcoredemo111;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("appconfig.xml");

        Car carobj = (Car) context.getBean("mycar");//ye bean se referal hain

        // Car details
        System.out.println("Car Name: " + carobj.getCarname());//ye  getter method se fetch kar rahe hain
        System.out.println("Car Colour: " + carobj.getCarcolor());
        System.out.println("Car Brand: " + carobj.getCarbrand());

        // Engine details using the engine reference from the car
        Engine eng = carobj.getEng();
        System.out.println("Engine Type: " + eng.getEntype());
        System.out.println("Engine Number: " + eng.getEngno());
        System.out.println("Engine Manufacturer Name: " + eng.getMfname());

        ((ClassPathXmlApplicationContext) context).close();
    }
}