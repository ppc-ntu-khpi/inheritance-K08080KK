package test;

import domain.Tiger;

public class TestAnimal {

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Barsik");
        System.out.println(tiger);
        tiger.hunt();
        tiger.eat();
        tiger.speak();
        tiger.catches();
    }
}
