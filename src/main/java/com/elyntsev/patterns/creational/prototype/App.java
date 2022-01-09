package com.elyntsev.patterns.creational.prototype;

public class App {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Sheep1");
        System.out.println(sheep);

        Sheep clone = (Sheep) sheep.clone();
        //or
        //Sheep clone = (Sheep) sheep.copy();
        System.out.println(sheep.equals(clone));
        System.out.println(clone);
    }
}
