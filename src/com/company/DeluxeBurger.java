package com.company;

/**
 * created by s.a.miroshnychenko 9/24/2018
 */

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drink", 1.75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add add to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add add to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add add to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add add to Deluxe Burger");
    }
}
