package com.company;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.88);
        hamburger.addHamburgerAddition3("Chesse", 1.12);
        System.out.println("Total price " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.66);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        System.out.println("Total Healthy burger = "+ healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition2("",12.55);
        deluxeBurger.itemizeHamburger();
    }
}