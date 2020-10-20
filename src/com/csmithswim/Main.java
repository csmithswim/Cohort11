package com.csmithswim;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Blue", "Suburu", "1234",4, 2021);
        System.out.println(myCar.model);
        System.out.println(myCar.toString());
        myCar.displayDetails();

    }
}
