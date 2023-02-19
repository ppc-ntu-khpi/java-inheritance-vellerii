package domain;

public class Panda extends Predator {
    
    private String specie;
    
    public Panda(String name, int weight, String specie) {
       this.name = name;
       this.weight = weight;
       this.specie = specie;
    }

    public Panda() {
        this("Pou", 8,  "Big panda");
    }
    
    public Panda(String name) {
        this(name, 120,  "Big panda");
    }
    
    public void climb() {
        System.out.println("Panda is climbing...");
    } 
    
    @Override
    public void eat() {
        System.out.println("Panda eats bamboo.");
    }
    
    @Override
    public void speak() {
        System.out.println("Panda can squeak, growl, bark and snort.");
    }
    
    @Override
    public void sleep() {
        System.out.println("Panda sleeps 12 hours a day.");
    }
    
    @Override
    public void hunt() {
        System.out.println("Panda \"hunts\" for young shoots of bamboo.");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSpecie:\t" + this.specie + "\n\nThis is a panda!";
    }
    
}
