package test;

import domain.Panda;


 /**
 * The class Test animal
 */ 
public class TestAnimal {
    

/** 
 *
 * Main
 *
 * @param args  the args
 */
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
