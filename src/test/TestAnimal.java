package test;

import domain.Panda;

public class TestAnimal {
    
    public static void main(String[] args) {
        Panda thePanda = new Panda("Ray");
        System.out.println(thePanda);
        thePanda.hunt();
        thePanda.eat();
        thePanda.speak();
        thePanda.climb();
        thePanda.sleep();
    }
}
