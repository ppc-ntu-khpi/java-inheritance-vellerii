package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;
    
    protected Integer weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name = "generic animal";
        weight = 15;
    }
    

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating...");
    }
    

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking...");
    }
    

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Animal sleeping...");
    }
    

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight + " kg";
    }
}
