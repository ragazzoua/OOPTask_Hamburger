package com.company;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.88);
        hamburger.addHamburgerAddition3("Chesse", 1.12);
        System.out.println("Total price " + hamburger.itemizeHamburger());
    }
}