package domain;


 /**
 * The class Panda extends predator
 */ 
public class Panda extends Predator {
    
    private String specie;
    

/** 
 *
 * Panda
 *
 * @param name  the name
 * @param weight  the weight
 * @param specie  the specie
 */
    public Panda(String name, int weight, String specie) { 

       this.name = name;
       this.weight = weight;
       this.specie = specie;
    }


/** 
 *
 * Panda
 * It is a default constructor
 */
    public Panda() { 

        this("Pou", 8,  "Big panda");
    }
    

/** 
 *
 * Panda
 * It is a constructor that takes String name
 * @param name  the name
 */
    public Panda(String name) { 

        this(name, 120,  "Big panda");
    }
    

/** 
 *
 * Climb
 *
 */
    public void climb() { 

        System.out.println("Panda is climbing...");
    } 
    
    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Panda eats bamboo.");
    }
    
    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Panda can squeak, growl, bark and snort.");
    }
    
    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Panda sleeps 12 hours a day.");
    }
    
    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Panda \"hunts\" for young shoots of bamboo.");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nSpecie:\t" + this.specie + "\n\nThis is a panda!";
    }
    
}
