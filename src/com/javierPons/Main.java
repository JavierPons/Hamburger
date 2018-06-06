package com.javierPons;

public class Main {

    public static void main(String[] args) {

       BasicHamburger hamburger = new BasicHamburger("Basic", "Sousage", 3.6 ,"White");

       double price = hamburger.itemizeHamburger();
       hamburger.addhamburgerAddition1("Tomato", 0.27);
       hamburger.addhamburgerAddition2("LEtture", 0.75);
       hamburger.addhamburgerAddition3("Bacon",1);
       price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger() + "€");
    }
}
