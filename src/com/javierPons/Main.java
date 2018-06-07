package com.javierPons;

public class Main {

    public static void main(String[] args) {

       BasicHamburger hamburger = new BasicHamburger("Basic", "Sousage", 3.6 ,"White");
       double price = hamburger.itemizeHamburger();
       hamburger.addhamburgerAddition1("Tomato", 0.27);
       hamburger.addhamburgerAddition2("Letture", 0.75);
       hamburger.addhamburgerAddition3("Bacon",1);
       System.out.println("Total burger price is: " + hamburger.itemizeHamburger() + "€");

       HealthyBurger healthyBurgeri = new HealthyBurger("Bacon", 5.34);
       healthyBurgeri.addhamburgerAddition1("Egg", 4.5);
       healthyBurgeri.addHealthAddition1("Basilic", 1);
        healthyBurgeri.itemizeHamburger();
        System.out.println("Total Healthy Burger price is " + healthyBurgeri.itemizeHamburger());

        Delux db = new Delux();
        db.addhamburgerAddition3("mushroom", 3);
        db.itemizeHamburger();
    }
}
