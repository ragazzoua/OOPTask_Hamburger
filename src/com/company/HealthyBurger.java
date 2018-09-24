package com.company;

/**
 * created by s.a.miroshnychenko 9/24/2018
 */

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addAdditional1(String name, double price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addAdditional2(String name, double price) {
        this.healthyExtra2Name = healthyExtra1Name;
        this.healthyExtra2Price = healthyExtra1Price;
    }
}
