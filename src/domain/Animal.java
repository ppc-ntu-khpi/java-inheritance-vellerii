package domain;

public class Animal {

    protected String name;
    
    protected Integer weight;
    
  

    public Animal() {
        name = "generic animal";
        weight = 15;
    }
    
    public void eat() {
        System.out.println("Animal eating...");
    }
    
    public void speak() {
        System.out.println("Animal speaking...");
    }
    
    public void sleep() {
        System.out.println("Animal sleeping...");
    }
    

    @Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight + " kg";
    }
}
