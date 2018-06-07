package com.javierPons;

public class Delux extends BasicHamburger {

    public Delux() {
        super("Deluxe","Sousage & Bacon", 14.56, "White");
        super.addhamburgerAddition1("Chips", 1.05);
        super.addhamburgerAddition2("Coke", 1.5);
    }

    @Override
    public void addhamburgerAddition1(String name, double price) {
        System.out.println("Can´t add additional items to a Delux burger");
    }

    @Override
    public void addhamburgerAddition2(String name, double price) {
        System.out.println("Can´t add additional items to a Delux burger");
    }

    @Override
    public void addhamburgerAddition3(String name, double price) {
        System.out.println("Can´t add additional items to a Delux burger");
    }

    @Override
    public void addhamburgerAddition4(String name, double price) {
        System.out.println("Can´t add additional items to a Delux burger");
    }
}
